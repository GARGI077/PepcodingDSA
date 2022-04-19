package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();

        int nstars=n;
        int nspaces=0;

        for(int i=1;i<=n;i++)
        {
            for(int c=1;c<=nspaces;c++)
            {
                System.out.print("\t");
            }
            for (int c=1;c<=nstars;c++)
            {
                System.out.print("*\t");
            }
            System.out.println();



            nstars--;
            nspaces++;
            // row++;
        }

        in.close();

    }
}
