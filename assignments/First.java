package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value 1:");
        int V1 = sc.nextInt();
        System.out.println(("Value 2:"));
        int V2 = sc.nextInt();
        int a = V2/V1;
        if (V1*V1 == V2){
            System.out.println(V2 + " is a multiple and square of " + V1);
        } else if (V2%V1 == 0) {

            System.out.println(V2 + " is the " + a + " multiple of " + V1);
        } else{
            System.out.println(V2 + " is neither a square nor a multiple of " +V1);

    }
    }}

