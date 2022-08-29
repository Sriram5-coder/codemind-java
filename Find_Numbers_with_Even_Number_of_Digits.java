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
        for(int i=0;i<N;i++)
        {
            int n=(int)Math.log10(arr[i])+1;
            if(n%2==0)
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}