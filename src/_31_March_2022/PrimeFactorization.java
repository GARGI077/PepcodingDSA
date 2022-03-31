package _31_March_2022;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int fact=2;fact*fact<=n;fact++)
        {
            while(n%fact==0)
            {
                System.out.println(fact+" ");
                n=n/fact;
            }
        }
    }
}
