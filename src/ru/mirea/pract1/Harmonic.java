package ru.mirea.pract1;

public class Harmonic {
    public static void main(String[] args) {
        double sum=0;
        for (int i=1; i<11; i++ ){
            sum+= 1.0/i;
            System.out.printf("%.2f ", 1.0/i,  " ");
        }
        System.out.println();
        System.out.printf("%.2f ", sum);
    }
}
