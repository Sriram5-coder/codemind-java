import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        for(int i=1;i<=r;i+=2)
        {
            System.out.println(n+" x "+i+" = "+n*i);   
        }
    }
}