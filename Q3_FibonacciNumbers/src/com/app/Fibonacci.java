package com.app;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 10; // Number of terms to display
        System.out.println("First 10 numbers ==" + num +"==");

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciCalc(i) + " ");
        }
    }

    public static int fibonacciCalc(int no) {
        if (no <= 1) {
            return no;
        }
        
        int first = 0, curr = 1;

        for (int i = 2; i <= no; i++) {
            int next = first + curr;
            first = curr;
            curr = next;
        }

        return curr;
    }
}
