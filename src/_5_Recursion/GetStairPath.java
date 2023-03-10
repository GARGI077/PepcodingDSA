package _5_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static void main(String[] args) throws Exception {

        Scanner in =new Scanner(System.in);

        int n=in.nextInt();
        ArrayList<String> paths = getStairPaths(n);

        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n==0)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;

        }

        ArrayList<String> myPath = new ArrayList<String>();

        if(n>=1)
        {
            ArrayList<String> path1Step =getStairPaths(n-1);
            for(String path:path1Step)
            {
                myPath.add('1'+path);
            }
        }



        if(n>=2)
        {
            ArrayList<String> path2Step = getStairPaths(n-2);
            for(String path:path2Step)
            {
                myPath.add('2'+path);
            }
        }


        if(n>=3)
        {
            ArrayList<String> path3Step =getStairPaths(n-3);
            for(String path:path3Step)
            {
                myPath.add("3"+path);
            }
        }


        return myPath;
    }

}
