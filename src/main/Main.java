package main;

import service.Logics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name Company");
        String a = sc.nextLine();
        System.out.println("Adress Company");
        String b = sc.nextLine();
        System.out.println("lesson");
        String c = sc.nextLine();
        System.out.println("Time lesson");
        String d = sc.nextLine();
        System.out.println("Name");
        String e = sc.nextLine();
        System.out.println("Surname");
        String f = sc.nextLine();
        System.out.println("age");
        String j = sc.nextLine();
        System.out.println();
        System.out.println("happy brithay");
        String h = sc.nextLine();
        System.out.println("live in");
        String i = sc.nextLine();
        System.out.println(Logics.getEqualsStudents().toString());

    }
}