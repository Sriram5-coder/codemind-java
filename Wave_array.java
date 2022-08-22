import java.util.Scanner;
class Sample
{
    public static boolean wave(int n, int a,int b)
    {
        if((n<a &&n>b )||(n>a && n<b))
        {
            return true;
        }
        else
            return false;
            
    }
    public static void main(String args[])
    {
        int N;
        boolean sys=true;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<N-1;i++)
        {
            if(wave(arr[i],arr[i-1],arr[i+1]))
            {
                sys=false;
            }
        }
        if(sys)
        {
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}