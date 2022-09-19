import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int P,T,R;
        Scanner sc=new Scanner(System.in);
        P=sc.nextInt();
        T=sc.nextInt();
        R=sc.nextInt();
        System.out.println((P*T*R)/100);
    }
}