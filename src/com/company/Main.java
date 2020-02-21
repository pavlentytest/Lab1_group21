package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = scan.nextInt();
        }
        for(int i=0;i<a.length;i++) {
            if(a[i]%5==0 || a[i]%7==0) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
