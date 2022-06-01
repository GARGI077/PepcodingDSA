package Recursion;

import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        printDecreasing(num);
    }

    public static void printDecreasing(int n){
        if(n>0) // Base Case
        {
            System.out.println(n);
            printDecreasing(n-1);
            //System.out.println(n);
        }
    }

}
