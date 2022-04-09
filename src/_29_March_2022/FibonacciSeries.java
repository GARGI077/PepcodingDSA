package _29_March_2022;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // write your code here
        Scanner in= new Scanner(System.in);

        int num= in.nextInt();
        int a=0;
        int b=1;

        for(int i=0;i<num;i++)
        {
            int temp=a+b;

            System.out.println(""+a);
            a=b;
            b=temp;
        }

    }
}
