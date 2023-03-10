package _3_2DArray;

import java.util.Scanner;

public class StateofWakanda {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int nr=in.nextInt();
        int nc=in.nextInt();

        int[][] mat=new int[nr][nc];

        fillMatrix(mat,in);

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

    public static void State(int mat[][])
    {

        int nr=mat.length;
        int nc= mat[0].length;

            for (int j=0;j<nc;j++)
            {
                if(nc%2==0)
                {// top to bottom
                    for (int i=0;i<nr;i++)
                    {
                        System.out.println(mat[i][j]);
                    }
                }
                else
                { //bottom to top
                    for (int i=nr-1;i>=0;i--)
                    {
                        System.out.println(mat[i][j]);
                    }
                }
            }



    }
}
