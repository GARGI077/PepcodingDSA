package _1_Basic_Fundamentals;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is largest");
        }
        else if(b>c)
            System.out.println(b+" is largest");
            else
                System.out.println(c+" is largest");

            in.close();
    }
}
