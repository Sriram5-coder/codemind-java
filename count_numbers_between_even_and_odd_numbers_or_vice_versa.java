import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=1;i<N-1;i++)
        {
            if(((arr[i-1]%2==0) && (arr[i+1]%2!=0)) || (arr[i-1]%2!=0) && (arr[i+1]%2==0))
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}