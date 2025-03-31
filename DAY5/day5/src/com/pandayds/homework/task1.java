package com.pandayds.homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //数组的输入

        //字符串转
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr  = str.split(",");
        int[] b = new int[arr.length];
        for(int j = 0; j<b.length;j++) {
            b[j] = Integer.parseInt(arr[j]);
            System.out.println(b[j]+" ");
        }

        //或者循环输入
        System.out.println("请输入3个数字，并用空格隔开");
        Scanner sc1 = new Scanner(System.in);
        int[] arr1 = new int[3];
        for (int k = 0; k < 3; k++) {
            arr1[k] = sc.nextInt();
        }
        System.out.println(arr1[2]);

        //求最值题目示例
        int[] arr2 = {33,5,22,44,555};
        int result = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > result){
                result = arr2[i + 1];
            }
        }
        System.out.println("最大值为：" + result);

    }
}
