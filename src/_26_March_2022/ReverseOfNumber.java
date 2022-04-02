package _26_March_2022;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int num=in.nextInt();

        int rev=0,rem=0;

        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of Number is "+rev);
    }
}
