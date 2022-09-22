package ru.mirea.pract1;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int result=1;
        for (int i=1; i<=number; i++){
            result *=i;
        }
        System.out.println("Factorial is " + result);
    }
}
