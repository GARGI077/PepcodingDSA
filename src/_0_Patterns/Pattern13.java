package _0_Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int num=in.nextInt();

        for(int row=1;row<num;row++)
        {
            int ncr = 1;
            for(int col=0;col<=row;col++)
            {
                System.out.print(ncr+"\t");
                int n = row;
                int r = col;
                int next = ((n-r)*ncr)/(r+1);
                ncr = next;

            }
            System.out.println();
        }
    }
}
