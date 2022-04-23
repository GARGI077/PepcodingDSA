package _2D_Array;

import java.util.Scanner;

public class StateofWakanda2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter row column");
        int nr=in.nextInt();
        int nc=in.nextInt();

        int[][] mat=new int[nr][nc];

        System.out.println("enter matrix");
        fillMatrix(mat,in);

        System.out.println("display matrix");
        display(mat);

        System.out.println("Diagonal matrix");
        diagonal(mat);

     }
    public static void fillMatrix(int mat[][],Scanner in)
    {
        int nr=mat.length;
        int nc= mat[0].length;
        for (int i=0;i<nr;i++)
        {
            for (int j=0;j<nc;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
    }


    public static void display(int mat[][])
    {
        int nr=mat.length;
        int nc= mat[0].length;
        for (int i=0;i<nr;i++)
        {
            for (int j=0;j<nc;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void diagonal(int mat[][]) {

        int n=mat.length;
        int nr = mat.length;
        int nc = mat[0].length;
        for (int gap = 0; gap < nr; gap++) {
            int r=0,c=gap;

            while(r<n&& c<n)
            {
                System.out.println(mat[r][c]);
            }
            r++;
            c++;
        }
    }

}
