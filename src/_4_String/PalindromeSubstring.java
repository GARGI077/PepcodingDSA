package _4_String;

import java.util.Scanner;

public class PalindromeSubstring {

public static boolean isPalindrome(String str)
{

    int l=0,r=str.length()-1;

    while (l<r)
    {
      if(str.charAt(l)!=str.charAt(r))
      {
          return false;
      }
      l++;
      r--;
    }

return true;
}




    public static void solution(String str){
        //write your code here
        int count=0;
        for(int sidx=0;sidx<str.length();sidx++)
        {
            for(int eidx=sidx+1;eidx<=str.length();eidx++)
            {
               String ss= str.substring(sidx,eidx);

                if(isPalindrome(ss))
                {
                    System.out.println(ss);
                    count++;
                }

            }

        }
        System.out.println("Total no of palindromic String : "+count);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
