/* Each digit (0 to 9) denotes the student of the Optica Student community.

2. You are given a number n where ith digit denotes that ith task that is assigned to the corresponding digit student.

2. You are given a digit d denotes a student.

3. You are required to calculate the frequency of digit d in number n or how many tasks are assigned to student d.

Constraints
0 <= n <= 10^9 0 <= d <= 9

Format
Input
A number n A digit d
Output
A number representing frequency of digit d in number n
Example
Sample Input

994543234
 4
Sample Output
3



*/



package _2_Array;

import java.util.Scanner;

public class _1_DigitFrequency {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();

        int f=getDigitFrequency(n,d);
        System.out.println(f);
    }

    private static int getDigitFrequency(int n, int d) {
       int count=0;
        while (n>0)
        {
            int digit=n%10;
            n=n/10;
            if(digit==d)
            {
                count++;
            }
        }
        return count;
    }
}
