import java.util.*;
class Sample{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        int arr1[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            arr1[i]=(arr[i])*(arr[i]);
        }
        Arrays.sort(arr1);
        for(int i=0;i<N;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}