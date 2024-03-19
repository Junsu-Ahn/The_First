package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("== 프로젝트 시작 ==");

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        int i = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y + i);

        sc.close();

        System.out.println("== 프로젝트 끝 ==");

    }
}