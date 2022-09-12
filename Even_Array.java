import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        boolean boo=true;
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                boo=false;
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