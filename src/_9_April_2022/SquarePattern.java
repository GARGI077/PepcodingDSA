package _9_April_2022;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
