package Recursion;

import java.util.Scanner;

public class Fibonacii {

    public static void main(String[] args) throws Exception{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int f=fib(n);
        System.out.print(f);

    }
    public static int fib(int n){
        if(n==0||n==1) return n;

        return fib(n-1)+fib(n-2);
    }
}
