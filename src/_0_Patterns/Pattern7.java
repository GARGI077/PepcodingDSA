package _0_Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int  n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("*\t");
                }
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
