package com.ohgiraffers;

public class Counter {

    public static void main(String[] args) {
        int count = 0;  // 배수의 개수를 세기 위한 변수

        System.out.println("1부터 100까지 중 3의 배수이거나 7의 배수인 값 : ");

        // 1부터 100까지 반복
        for (int i = 1; i <= 100; i++) {
            // 3의 배수이거나 7의 배수인 경우
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
                count++;  // 배수일 경우 개수 증가
            }
        }
        // 줄 바꿈, 개수 출력
        System.out.println("\n배수들의 개수: " + count);
    }
}
