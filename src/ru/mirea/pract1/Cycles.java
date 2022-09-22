package ru.mirea.pract1;

import java.util.Scanner;
import java.util.*;
public class Cycles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("While\nEnter length of the list");
        int size = input.nextInt();
        int[] myList= new int [size];
        int i=0;
        int sum=0;
        int bonus;
        while (i<size){
            myList[i] = input.nextInt();
            sum+=myList[i];
            i++;
        }
        Arrays.sort(myList);
        System.out.println("Sum is " + sum + ";  Min is " + myList[0] + ";  Max is " + myList[size-1] + "\nFor\nEnter length of the list");
        size = input.nextInt();
        System.out.println(size);
        myList= new int [size];
        sum=0;
        for (i=0; i<size; i++){
            myList[i] = input.nextInt();
            sum+=myList[i];
        }
        bonus = sum/size;
        System.out.println("Sum is " + sum + ";  Average is " + bonus + "\nDo while\nEnter length of the list");
        size = input.nextInt();
        myList= new int [size];
        i=sum=0;

        do{
            myList[i] = input.nextInt();
            sum+=myList[i];
            i++;
        }
        while (i<size);
        Arrays.sort(myList);
        System.out.println("Sum is " + sum +";  Min is " + myList[0] + ";  Max is " + myList[size-1]);
    }
}
