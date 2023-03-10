package _1_Basic_Fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if((a*a)==((b*b)+(c*c)))
            {
                System.out.println("true");
            }

        else
            if((b*b)==((a*a)+(c*c)))
            {
                System.out.println("true");
            }
            else
            if((c*c)==((a*a)+(b*b)))
                System.out.println("true");
            else
                System.out.println("false");
        }


}
