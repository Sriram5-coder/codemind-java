import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N,zero=0,one=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            {
                zero++;
            }
            else
                one++;
        }
        for(int i=0;i<zero;i++)
        {
            System.out.print("0"+" ");
        }
        for(int i=0;i<one;i++)
        {
            System.out.print("1"+" ");
        }
    }
}