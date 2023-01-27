package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //hasNextInt() -> 입력받는 값이 int인 경우 true를 반환. int 외 입력 시 false로 while문 종료
        while (sc.hasNextInt()){

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);

        }
        sc.close();
    }

}
