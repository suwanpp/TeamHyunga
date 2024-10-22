package com.ohgiraffers;

import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(16); // 0부터 15까지의 난수 생성
//        int randomNumber = (int) (Math.random() * 16); 0부터 15 다른 방법

        if (randomNumber >= 10) {
            System.out.println("당첨입니다.");
        } else {
            System.out.println("아쉽네요.");
        }

        // 생성된 난수 출력 (선택 사항)
        System.out.println("생성된 난수: " + randomNumber);
    }
}
