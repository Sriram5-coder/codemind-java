import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i=i+2)
        {
            int k=x[i];
            while(k-->0)
              System.out.print(x[i+1]+" ");
        }
        sc.close();
        
    }
}