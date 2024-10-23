package com.ohgiraffers;

import java.util.Random;

public class RandomNum2 {

    public static void main(String[] args) {

        Random random = new Random();

        // 1부터 1000까지 난수 발생 (1 ~ 1000)
        int number = random.nextInt(1000) + 1;
        String original = String.valueOf(number);  // 숫자를 문자열로 변환
        String reversed = new StringBuilder(original).reverse().toString();  // 문자열을 뒤집음

        // 앞뒤가 같으면 출력
        if (original.equals(reversed)) {
            System.out.println("난수: " + original + " / 난수의 역순: " + reversed + " -> 출력");
        } else {
            System.out.println("앞뒤가 다른 난수가 생성됐습니다.");
        }
    }
}

