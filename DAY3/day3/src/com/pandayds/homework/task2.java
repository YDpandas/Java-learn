package com.pandayds.homework;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入存款金额：");
        int money = sc.nextInt();
        System.out.println("请输入存款年限：");
        int year = sc.nextInt();

        double outMoney = 0;

        if (year == 1) {
            outMoney = money + money * 2.25 / 100 * 1;
        } else if (year == 2) {
            outMoney = money + money * 2.7 / 100 * 2;
        } else if (year == 3) {
            outMoney = money + money * 3.25 / 100 * 3;
        } else if (year == 5) {
            outMoney = money + money * 3.6 / 100 * 5;
        } else {
            System.out.println("输入的年限有误");
        }

        System.out.println("存款" + year + "年后的本息是：" + outMoney);
    }
}