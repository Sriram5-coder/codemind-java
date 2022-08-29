import java.util.Scanner;
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
        int cnt=0;
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                cnt++;
                arr[i]=0;
                arr[i+1]=0;
            }
        }
        System.out.println(cnt);
    }
}