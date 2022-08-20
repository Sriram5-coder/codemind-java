import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N,K;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]%K!=0)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}