package com.ohgiraffers;

import java.util.Scanner;

public class multiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 입력 받기
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        // 조건 처리
        if (num == 0) {
            System.out.println("입력하신 숫자는 0입니다. 다른 숫자를 입력해주세요!");
        } else if (num % 3 == 0 && num % 4 == 0) {
            System.out.println("입력하신 " + num + "은(는) 3의 배수이면서 4의 배수입니다.");
        } else if (num % 3 == 0) {
            System.out.println("입력하신 " + num + "은(는) 3의 배수입니다.");
        } else if (num % 4 == 0) {
            System.out.println("입력하신 " + num + "은(는) 4의 배수입니다.");
        } else {
            System.out.println("입력하신 " + num + "은(는) 3의 배수도 4의 배수도 아닙니다.");
        }
    }
}
