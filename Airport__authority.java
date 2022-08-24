import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,T;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        T=sc.nextInt();
        int cost=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]>T)
            {
                cost+=2;
            }
            else
                cost+=1;
        }
        System.out.println(cost);
    }
}