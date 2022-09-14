import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        double doo=(double)((N-32)*5)/9;
        System.out.format("%.2f",doo);
    }
}