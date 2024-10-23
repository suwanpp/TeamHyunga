package com.ohgiraffers;


import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 입력 받기
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        // 입력된 숫자가 양수인지, 음수인지, 또는 0인지 확인
        if (num > 0) {
            System.out.println("입력하신 숫자는 양수입니다");
        } else if (num < 0) {
            System.out.println("입력하신 숫자는 음수입니다");
        } else {
            System.out.println("0입니다");
        }
        // 프로그램 종료 메시지
        System.out.println("프로그램을 종료합니다");
    }
}
