import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr1[]=new int[N];
        int arr2[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr1[i]+arr2[i]+" ");
        }
    }
}