package com.ohgiraffers.com;

public class EvenOddSum {
    public static void main(String[] args) {
        // 정수 배열 초기화
        int[] numbers = {5, 12, 7, 4, 3, 20, 15, 8, 2, 9};

        // 짝수와 홀수의 합을 저장할 변수 초기화
        int evenSum = 0; // 짝수 합
        int oddSum = 0;  // 홀수 합

        // 배열의 각 요소를 반복하며 짝수와 홀수 구분
        for (int i = 0; i < numbers.length; i++) {
            // 현재 요소가 짝수인지 홀수인지 확인
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i]; // 짝수라면 짝수 합에 추가
            } else {
                oddSum += numbers[i]; // 홀수라면 홀수 합에 추가
            }
        }

        // 결과 출력
        System.out.println("짝수의 합: " + evenSum);
        System.out.println("홀수의 합: " + oddSum);
    }
}

