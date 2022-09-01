import java.util.Scanner;
class Sample
{
    public static int[] smnumber(int nums[])
    {
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])   count++;
            }
            ans[i]=count;
        }
        return ans;
    }
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
        int arr1[]=smnumber(arr);
        for(int i=0;i<N;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}