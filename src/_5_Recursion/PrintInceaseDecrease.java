package _5_Recursion;

import java.util.Scanner;

public class PrintInceaseDecrease {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        pdi(num);

    }

    public static void pdi(int n){

        if(n>0)
        {
            System.out.println(n);
            pdi(n-1);
            System.out.println(n);
        }
    }

}
