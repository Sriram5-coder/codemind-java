import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
	{
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
    public static void main(String args[])
    {
        int N,cnt=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(arr[i]<=1)
            {
                continue;
            }
            else if(isPrime(arr[i]))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}