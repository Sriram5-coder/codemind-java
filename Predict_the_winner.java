import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum1=0,sum2=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
              sum1+=sc.nextInt();
            else
              sum2+=sc.nextInt();
        }
        if(Math.abs(sum1-sum2)%4==0)
           System.out.println("X");
        else
           System.out.println("Y");
    }
}