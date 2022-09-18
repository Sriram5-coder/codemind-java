import java.util.Scanner;
class Clock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String val[]=s.split(":");
        int hh=Integer.parseInt(val[0]);
        int mm=Integer.parseInt(val[1]);
        
        float angle=(30*hh)-((float)11/2)*mm;
        angle=Math.abs(angle);
        if(angle>180)
        {
            System.out.println(360-angle);
        }
        else
        System.out.println(angle);
      
        sc.close();
        
    }
}