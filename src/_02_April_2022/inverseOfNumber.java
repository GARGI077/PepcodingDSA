package _02_April_2022;

import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int n=in.nextInt();
        int ans =0;
        int pos=1;
        while(n!=0)
        {
            int digit=n%10;
            ans +=pos*(Math.pow(10,digit-1));
            n=n/10;
            pos++;
        }
        System.out.println(ans);

        in.close();
    }
}
