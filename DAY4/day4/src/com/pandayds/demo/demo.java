package com.pandayds.demo;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class demo {

    /*朋友聚会的时候可能会玩一个游戏：逢7过
        游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过：过
        需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/

//    public static void main(String[] args) {
//        int num,ge,shi;
//        for(int i = 1;i < 100; i++){
//            ge = i % 10;
//            shi = i / 10;
//            if (ge == 7 || shi == 7 || i % 7 == 0) {
//                System.out.println("过");
//            }
//            else {
//                System.out.println(i);
//            }
//        }
//        System.out.println("100");
//    }

    /*需求：键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。
        结果只保留整数部分 ，小数部分将被舍去 。*/

//    public static int sqrt(int x) {
//        if (x < 0) {
//            System.out.println("不存在实根");
//            return -1;
//        } else if (x == 0) {
//            return 0;
//        }
//        int i;
//        for (i = 1; i <= x; i++) {
//            if (i * i == x) {
//                return i;
//            } else if (i * i > x) {
//                return i - 1;
//            }
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("请输入数字：");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int result = sqrt(x);
//        System.out.println(result);
//    }


    //求质数

//    public static void main(String[] args) {
//        System.out.println("请输入要判断的数");
//        int x;
//        Scanner sc = new Scanner(System.in);
//        x = sc.nextInt();
//        boolean bool = false;
//        for(int i = 2;i<=Math.sqrt(x);i++){
//            if(x % i != 0) {
//                bool = true;
//            }
//            else{
//                bool = false;
//                break;
//            }
//        }
//        if(x == 1 || x == 2 || x == 3){
//            bool = true;
//        }
//        if(bool){
//            System.out.println("是质数");
//        }
//        else {
//            System.out.println("不是质数");
//        }
//    }

    //猜数字

    public static void main(String[] args) {
        boolean again = false;
        do {
            Random r = new Random();
            int num = r.nextInt(100) + 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("猜数字吧！(1-100)");
            int guess = sc.nextInt();
            boolean bool = false;
            if (guess > num) {
                System.out.println("大了");
            } else if (guess < num) {
                System.out.println("小了");
            } else {
                System.out.println("答对了!");
                bool = true;
            }
            for (int i = 2; i < 6; i++) {
                if (bool) {
                    break;
                }
                System.out.println("第" + i + "次尝试");
                guess = sc.nextInt();
                if (guess > num) {
                    System.out.println("大了");
                } else if (guess < num) {
                    System.out.println("小了");
                } else {
                    System.out.println("答对了!");
                    bool = true;
                    break;
                }
            }
            if (bool) {
                System.out.println("恭喜！要再来一次吗？（输入Y/N)");
            } else {
                System.out.println("失败了...要再来一次吗？（输入Y/N)");
            }
            String choice = sc.next();
            again = Objects.equals(choice, "Y") || Objects.equals(choice, "y");
        } while (again);
    }
}