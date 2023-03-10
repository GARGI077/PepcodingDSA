package _4_String.Easy;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.next();
            System.out.println(reverseString(s));
            t--;
        }
    }
    public void reverseString(String s) {

        int j=s.length()-1;

        char temp;

        for(int i=0;i<s.length()/2;i++,j--)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;


        }
        System.out.print(s);
    }
}
