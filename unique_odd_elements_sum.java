import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            if((arr[i]%2!=0)&& (arr[i]>0))
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}