import java.util.Scanner;
class Sample
{
    public static int[] getArray(int x[],int y[])
    {
        int output[]=new int[y.length];
        int i,j=0;
        for(i=0;i<y.length;i++)
        {
            if(y[i]<j)
            {
                int k=j;
                while(k>y[i])
                {
                    output[k]=output[k-1];
                    k--;
                }
                output[y[i]]=x[i];
                j++;
            }
            else
              {
                  output[y[i]]=x[i];
              
                  j++;
              }
        }
        return output;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,x[],y[];
        m=sc.nextInt();
        x=new int[m];
        for(int i=0;i<m;i++)
          x[i]=sc.nextInt();
        n=sc.nextInt();
        y=new int[n];
        for(int i=0;i<n;i++)
          y[i]=sc.nextInt();
        int result[]=getArray(x,y);
        for(int ele:result)
          System.out.print(ele+" ");
        sc.close();
         
    }
}