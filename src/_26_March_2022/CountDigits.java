package _26_March_2022;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int num=in.nextInt();
        int count=0;

        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("the no of digits "+count);
    }
}
