package com.pandayds.demo;
import java.util.Scanner;

public class HellWorld {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        System.out.println(number1 + number2);
    }
}

