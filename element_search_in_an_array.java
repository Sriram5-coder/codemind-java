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
        int K=sc.nextInt();
        boolean boo=false;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==K)
            {
                boo=true;
            }
        }
        if(boo)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}