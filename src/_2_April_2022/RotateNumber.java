package _2_April_2022;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();

        int count=0;
        int temp=n;

        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }

        //true rotation
        k=k%count;
        if(k<0)
        {
            k=k+count;
        }
        //split
        int splitHelper=(int)Math.pow(10,k);
        int p1=n/splitHelper;
        int p2=n%splitHelper;

        //Merge
        int mergeHelper=(int)Math.pow(10,count-k);
        int ans=(p2*mergeHelper)+p1;
        //approach
            //1->count no of digits
            //2->Split
            //3->Merge

//        while (num != 0) {
//            num = num / 10;
//            count++;
//
//        }
//
//        while (temp != 0) {
//            part1 = temp / Math.pow(10, count - k);
//            part2 = temp % Math.pow(10, k);
//            new_num = (int) (part2 * Math.pow(10, count - k) + part1 * Math.pow(10, k));
//        }
//        System.out.println(new_num);
//
    }
}
