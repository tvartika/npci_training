package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value:");
        int V1 = sc.nextInt();
        int count = 0;
        while(V1!=0){
            V1 = V1/10;
            count++;}
        System.out.println("Number of digits: " +count);


        if (count % 2 == 0){
            int a = count*count;
            System.out.println(a);
        } else if(count % 3 == 0){
            int b = count*count*count;
            System.out.println(b);
        } else if(count % 2 !=0 && count % 3 != 0) {
            int c = count-1;
            int d = c*c;
            System.out.println(c);
            System.out.println(d);
        }
    }
}

