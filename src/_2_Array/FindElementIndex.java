package _2_Array;

import java.util.Scanner;

public class FindElementIndex {

    static int index(int[] arr,int element)
    {
        int s= arr.length;
        for(int i=0;i<s;i++)
        {

            if(arr[i]==element)
                return i;
        }
        return  -1;
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int size = in.nextInt();//enter the size
        int[] a=new int[size];

        for(int i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }

        System.out.println("Enter element");
        int element=in.nextInt();//element to be searched
        int index=index(a,element);

        System.out.println("index "+ index);


    }
}
