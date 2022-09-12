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
        for(int i=N-1;i>=0;i--)
        {
            if(arr[i]%2==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}