package _5_Recursion;

import java.util.Scanner;

public class ArrayElemnts {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
    displayArr(arr,0);

    }

    public static void displayArr(int[] arr,int idx){
        if(idx==arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx+1);



    }
}
