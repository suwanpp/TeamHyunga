package com.ohgiraffers;

import java.util.Scanner;

public class WordPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = sc.nextLine();  // 사용자로부터 문자열 입력 받음

        // 배열 대신 문자열 자체를 이용하여 각 단계별로 출력
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j));  // 문자열에서 문자 하나씩 출력
            }
            System.out.println();  // 한 단어가 끝나면 줄바꿈
        }
    }
}
