package com.example.lib;

import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入您需要轉換的字母：");
        char c = input.next().charAt(0);
        change(c);
    }

    private static void change(char c) {
        if(c>='A' && c<='Z'){
            c+=32;
            System.out.println("您輸入的大寫字母"+(char)(c-32)+"被轉換成了"+c);
        }else if(c>='a' && c<='z'){  //如果輸入的是小寫，-32即可得大小寫
            c-=32;
            System.out.println("您輸入的小寫字母"+(char)(c+32)+"被轉換成了"+c);
        }else{
            System.out.println("輸入的字元有誤！！");
        }
    }
}
