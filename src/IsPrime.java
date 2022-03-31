import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        int num=in.nextInt();
        boolean isPrime=true;
        
        for(int fact=1;fact*fact<=num;fact++)
        {
            if(num%fact==0) {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime)
        {
            System.out.println("Is Prime ");
        }
        else {
            System.out.println("Not Prime ");}
        
        
    }
}
