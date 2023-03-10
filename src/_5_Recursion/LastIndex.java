package _5_Recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        int k=in.nextInt();

        int li=lastIndex(a,0,k);

        System.out.println(li);

    }

    public static int lastIndex(int[] arr, int idx, int x){

        if(idx==arr.length) { return-1; }

        int rres=lastIndex(arr,idx+1,x);

        if(rres != -1) { return rres; }

        if(arr[idx]==x) { return idx; }


        return -1;

    }

}
