package Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        int fact=1;
        if (n==0) return 1;

        fact=n*factorial(n-1);

        return fact;
    }

}
