package Recursion;

import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();
        int p=power(x,n);
        System.out.println(p);
    }

    public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }

        int xpow=power(x,n/2);
        int ans=xpow*xpow;
        if(n%2==1)
            ans=ans*x;

        return ans;
    }


}
