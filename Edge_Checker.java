import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int A,B;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        if((A+1==B)||(A-1==B) || (A+9==B) ||(A-9==B))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}