package com.ohgiraffers;

import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        Random random = new Random();
        int num;
        String original, reversed;

        // 난수와 역순이 같은 경우가 나올 때까지 반복
        while (true) {
            num = random.nextInt(1000) + 1;  // 1부터 1000까지의 난수 발생
            original = String.valueOf(num);  // 숫자를 문자열로 변환
            reversed = new StringBuilder(original).reverse().toString();  // 문자열을 뒤집음

            // 난수와 역순이 같으면 출력하고 종료
            if (original.equals(reversed)) {
                System.out.println("난수: " + original + " / 난수의 역순: " + reversed + " -> 출력");
                break;  // 조건을 만족하면 반복 종료
            }
        }
    }
}
