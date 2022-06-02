package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();

        int power=power(x,n);
        System.out.println(power);
    }

    public static int power(int x, int n){
        if(n==0)   return 1;

        int p=x*power(x,n-1);
        return p;
    }

}
