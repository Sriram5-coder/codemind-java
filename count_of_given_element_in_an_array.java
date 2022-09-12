import java.util.Scanner;
class Sample
{
    public static void main(String argsp[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt();
        int cnt=0;
        for(int i=0;i<N;i++)
        {
            if(K==arr[i])
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}