package _2_Array;

import java.util.Scanner;

public class Ceil_Floor_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int target = in.nextInt();
        int ceil_index = ceil(a, target);
        int last_index=lastIndex(a,target);
    }
    public static int ceil(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int idx=-1;
        //int firstIndex;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (target == nums[mid]) {
                idx= mid;
                r = mid - 1;

            } else if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            }

        }
        return idx;
    }
    public static int lastIndex(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int idx=-1;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (target == nums[mid]) {
                idx= mid;
                l = mid + 1;

            } else if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            }

        }
        return idx;
    }

}
