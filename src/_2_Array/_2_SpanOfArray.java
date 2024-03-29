
             //Span of an array
            // SPAN=MAXIMUM -MINIMUM
            package _2_Array;

            import java.util.Scanner;

            public class _2_SpanOfArray {

    static int span(int[]arr)
    {
        int s=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE,span;
        for (int i=1;i<s;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if (arr[i]<min)
                min=arr[i];
        }

        span=max-min;
        return span;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size=in.nextInt();//to input size of array
        int[] a=new int[size];

        for (int i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }

        int span=span(a);
        System.out.println(span);

        in.close();
    }
}
