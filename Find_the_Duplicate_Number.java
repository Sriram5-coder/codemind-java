import java.util.*;
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
        Arrays.sort(arr);
        for(int i=0;i<N;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}