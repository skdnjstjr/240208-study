package com.ohgiraffers.section01.conditional.test;

import java.util.Scanner;

public class Level02_2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int english = sc.nextInt();
        int average = (math+english)/2;
        if ( (average >= 60) && (math >= 40) && (english >=40) ) {

            System.out.println("합격");

        } else System.out.println("불합격");

    }

}
