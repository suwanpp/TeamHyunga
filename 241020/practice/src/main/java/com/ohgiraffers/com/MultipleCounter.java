package com.ohgiraffers.com;

public class MultipleCounter {
    public static void main(String[] args) {
        // 정수 배열 초기화
        int[] numbers = {5, 12, 7, 4, 15, 20, 9, 18, 25, 30};

        // 3의 배수와 5의 배수를 세기 위한 변수 초기화
        int countThree = 0; // 3의 배수 개수
        int countFive = 0;  // 5의 배수 개수

        // 배열의 각 요소를 반복하며 3의 배수와 5의 배수 구분
        for (int i = 0; i < numbers.length; i++) {
            // 현재 요소가 3의 배수인지 확인
            if (numbers[i] % 3 == 0) {
                countThree++; // 3의 배수라면 개수 증가
            }
            // 현재 요소가 5의 배수인지 확인
            if (numbers[i] % 5 == 0) {
                countFive++; // 5의 배수라면 개수 증가
            }
        }

        // 결과 출력
        System.out.println("3의 배수 개수: " + countThree);
        System.out.println("5의 배수 개수: " + countFive);
    }
}
