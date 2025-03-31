package com.pandayds.homework;

public class task1 {
    public static void main(String[] args) {
        double father = 177;
        double mother = 165;
        double son = (father + mother) * 1.08 / 2;
        double daughter = (father * 0.923 + mother) / 2;
        System.out.println("儿子预计身高" + son + "厘米");
        System.out.println("女儿预计身高" + daughter + "厘米");
    }
}
