import java.io.*;
class Grade_ride
{
    public static void main(String args[])throws Exception
    {
        int Hurl , Spin, Speed;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String a[] =br.readLine().split(" ");
			Hurl = Integer.parseInt(a[0]);
			Spin = Integer.parseInt(a[1]);
			Speed = Integer.parseInt(a[2]);
        if((Hurl>50) &&(Spin > 60) && (Speed> 100))
        {
            System.out.println("10");
        }
        else if((Hurl>50) &&(Spin > 60))
        {
            System.out.println("9");
            
        }
        else if((Spin > 60) && (Speed> 100))
        {
            System.out.println("8");
        }
        else if((Hurl>50) && (Speed> 100))
        {
            System.out.println("7");
        }
        else if((Hurl>50) || (Spin > 60) || (Speed> 100))
        {
            System.out.println("6");
        }
        else
        System.out.println("5");
    }
}