package Recursion;

import java.util.Scanner;

public class PrintRev {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        displayArrReverse(arr,n-1);
    }


    public static void displayArrReverse(int[] arr, int idx) {

        if(idx<0) return;

        System.out.println(arr[idx]);
        displayArrReverse(arr,idx-1);

    }

}
