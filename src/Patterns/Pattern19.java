package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int n=in.nextInt();
        int mid=n/2+1;
        for(int r=1;r<=n;r++)
        {
            for (int c=1;c<=n;c++)
            {
                if(r==1)
                {
                    if(c<=mid||c==n)
                    {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }

                }
                else if(r>1&& r<mid)
                {
                    if(c==n||c==mid)
                    {
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }
                else if(r==mid)
                {
                    System.out.print("*\t");
                }
                else if(r>mid && r<n)
                {
                    if(c==1||c==mid)
                    {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }

                }
                else if(r==n)
                {
                    if(c == 1 ||c>=mid)
                    {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }

            }
            System.out.println();
        }
    }
}
