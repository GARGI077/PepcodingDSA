package _2_Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        int target = in.nextInt();
        int index=search(a,target);
    }
    public static int search(int[] nums, int target) {

        int l=0;
        int r=nums.length-1;

        while(l<=r)
        {
            int mid=(l+r)/2;

            if(target==nums[mid])
            {
                return mid;
            }
            else
            if(target>nums[mid])
            {
                l=mid+1;
            }
            else
            if(target<nums[mid])
            {
                r=mid-1;
            }

        }
        return -1;
    }

}
