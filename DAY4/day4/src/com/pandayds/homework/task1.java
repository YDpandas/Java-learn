package com.pandayds.homework;

import java.util.Scanner;

//力扣第九题

public class task1 {

    //方式0：
    public static boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0))
        {return false;}
        int i;
        for(i=0;i<x;)
        {i=i*10+x%10;
            x=x/10;}
        return x==i||x==i/10;
    }

    //方式1：不将数字转变为字符串进行对比
    public boolean isPalindrome1(int x) {
        boolean bool = false;
        if(x < 0) return false;
        int num = 0,temp = x,ge;
        while(temp != 0){
            ge = temp % 10;
            num = num * 10 + ge;
            temp = temp / 10;
        }
        if(num == x){
            bool = true;
        }
        return bool;
    }

    //方式2：将输入的数字转换为字符串进行对比
    public boolean isPalindrome2(int x){
        if(x < 0){
            return false;
        }
        String str = Integer.toString(x);
        int left,right;
        left = 0;
        right = str.length() - 1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数x:");
        x = sc.nextInt();
        //判断回文数
        boolean bool = isPalindrome(x);
//        int num = 0,temp = x,ge;
//        while(temp != 0){
//            ge = temp % 10;
//            num = num * 10 + ge;
//            temp = temp / 10;
//        }
//        if(num == x){
//            bool = true;
//        }

        //输出
        if(bool){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

