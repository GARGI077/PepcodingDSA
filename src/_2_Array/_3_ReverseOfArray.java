package _2_Array;

import java.util.Scanner;

public class _3_ReverseOfArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int size= in.nextInt();
        int arr[]=new int[size];
        int i,k,t;
        for(i=0;i< arr.length;i++)
        {
            arr[i]= in.nextInt();
        }

        //reverse
        // begin from 1st i=0
        // read till mid
        //swap first and last elements
        for (i=0;i<size/2;i++)
        {    k=size-i-1;
             t=arr[i];
             arr[i]=arr[k];
             arr[k]=t;
        }
        for(i=0;i<size-1;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
