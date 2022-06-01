package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        printIncreasing(num);
    }

    public static void printIncreasing(int n){

        if(n>0)
        {
            printIncreasing(n-1);
            System.out.println(n);
        }


    }

}
