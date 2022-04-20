package Array;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int n_a=in.nextInt();
        int[] a=new int[n_a];

        for (int i=0;i<n_a;i++)
        {
            a[i]=in.nextInt();
        }
        int n_b=in.nextInt();
        int[] b=new int[n_b];
        for (int i=0;i<n_b;i++)
        {
            b[i]=in.nextInt();
        }
        int res[] = sum(a, b);
        display(res);

    }
    public static void display(int arr[]){
        for(int vl : arr){
            System.out.print(vl+" ");
        }
    }
    public static int[] sum(int a[],int b[])
    {
        int maxLen=Math.max(a.length,b.length);

        int res[]=new int[maxLen];

        int pa=a.length-1,pb=b.length-1,pc=maxLen-1;

        int carry=0;
        while(pc>=0)
        {
            int v1=(pa>=0)?a[pa]:0;
            int v2=(pb>=0)?b[pb]:0;

            int sum=v1+v2+carry;
            int digit=sum%10;
            carry=sum/10;

            res[pc]=digit;
            pa--;
            pb--;
            pc--;
        }


        if(carry==0)
        {
            return res;
        }
        else
        {
            int[] newRes=new int[maxLen+1];
            newRes[0]=carry;
            for (int i=1;i<newRes.length;i++)
            {
                newRes[i]=res[i-1];
            }

        }
        return res;
    }
}
