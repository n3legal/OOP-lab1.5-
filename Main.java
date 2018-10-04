package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long num;
        Scanner in = new Scanner(System.in);
        num = in.nextLong();
        fact(num);
    }

    public static void fact (long num){
        long res = 1;
        for (long i = 1; i <= num; i ++){
            res *= i;
        }
        System.out.println("Result: " + res);
    }
}
