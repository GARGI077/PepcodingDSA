package _29_March_2022;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        // write ur code here
        while (t-- > 0) {
            int num = in.nextInt();

            boolean isPrime = true;


            for (int fact = 2; fact * fact <= num; fact++) {
                if (num % fact == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println("prime");

            } else {
                System.out.println("not prime");
            }


        }
    }
}