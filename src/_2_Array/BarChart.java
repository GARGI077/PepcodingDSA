package _2_Array;

import java.util.Scanner;

public class  BarChart {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        sc.close();
        barGraph(arr, n);
    }

    public static void barGraph(int[] arr, int n) {
        // your code here
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        for(int floor=max;floor>=1;floor--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>=floor)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
