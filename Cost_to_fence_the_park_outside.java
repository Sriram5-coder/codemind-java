import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int L,B,W,C;
        Scanner sc=new Scanner(System.in);
        L=sc.nextInt();
        B=sc.nextInt();
        W=sc.nextInt();
        C=sc.nextInt();
        int L2=L+(2*W);
        int B2=B+(2*W);
        int tot=((L2*B2)-(L*B));
        System.out.println(tot*C);
    }
}