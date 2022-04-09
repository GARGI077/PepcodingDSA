package _9_April_2022;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int n=in.nextInt();

        for(int r=1;r<=n;r++)
        {
            int nstars=r;
            int nspaces=n-r;
            for (int i=1;i<=nspaces;i++)
            {
                 System.out.print("\t");
            }
            for(int i=1;i<=nstars;i++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
