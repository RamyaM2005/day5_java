import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int rev=0;
            int temp=n;
            while(n>0)
            {
                int digit=n%10;
                rev=rev*10+digit;
                n/=10;
            }
            System.out.println(rev);
            if(temp==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        }
    }
}