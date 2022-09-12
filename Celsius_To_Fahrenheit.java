import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner (System.in);
        N=sc.nextInt();
        double p=(N*1.8)+32;
        System.out.format("%.2f",p);
    }
}