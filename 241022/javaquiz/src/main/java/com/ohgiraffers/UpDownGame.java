package com.ohgiraffers;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100) + 1; // 1부터 100까지의 난수 생성,  nextInt(100) = 0~99반환
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("1부터 100까지의 난수를 맞춰보세요!");

        while (userGuess != randomNum) {
            System.out.print("숫자를 입력하세요: ");
            userGuess = sc.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("1부터 100 사이의 숫자를 입력하세요.");
            } else if (userGuess < randomNum) {
                System.out.println("UP!");
            } else if (userGuess > randomNum) {
                System.out.println("DOWN!");
            }
        }

        System.out.println("정답입니다. 생성된 난수는 " + randomNum + "입니다.");

    }
}

