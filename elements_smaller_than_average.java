import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int tot=0;
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            tot+=arr[i];
        }
        double avg=tot/N;
        int cnt=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]<=avg)
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}