package _0_Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        char ch='A';
        for(int r=1;r<=n;r++)
        {
            for(int i=1;i<=r;i++)
            {
                System.out.print(ch+"\t");
            }ch++;
            System.out.println();
        }
    }
}
