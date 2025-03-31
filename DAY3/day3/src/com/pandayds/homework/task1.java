package com.pandayds.homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int k = sc.nextInt();

        int min;

        if( i < j && i < k){
            min = i;
        }else if( j < i && j < k){
            min = j;
        }else{
            min = k;
        }

        System.out.println("最小值是" + min);
    }
}