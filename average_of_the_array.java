import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int av=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            av+=arr[i];
        }
        double doo=(double)av/N;
        System.out.format("%.2f",doo);
    }
}