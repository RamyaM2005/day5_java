import java.util.*;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int temp=n;
            int rev=0;
            while(n>0)
            {
                int digit=n%10;
                rev=rev+(digit*digit*digit);
                n/=10;
            }
            System.out.println(rev);
            if(temp==rev)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not a Armstrong");
        }
        }
    }
}