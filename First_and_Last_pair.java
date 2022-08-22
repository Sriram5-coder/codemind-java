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
        
            for(int i=0,j=N-1;i<N;i++,j--)
            {
                
                    if(N%2!=0 && i==j)
                    {
                        System.out.print(arr[i]+" "+0);
                        break;
                    }
                    else
                    {
                        System.out.print(arr[i]+" "+arr[j]+" ");
                        if(j<=N/2)
                        {
                            break;
                        }
                    }
                
            }
        
    }
}