import java.util.Scanner;
class Sample
{
    public static boolean checknum(int n)
    {
        int temp=n;
        while(temp>0)
        {
            if(temp%10!=0)
            {
                int j=temp%10;
                if(n%j!=0)
                {
                    return false;
                }
                temp/=10;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int N,M;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        for(int i=N;i<=M;i++)
        {
            if(checknum(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
}