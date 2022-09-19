import java.util.Scanner;
class Sample
{
    public static boolean isPal(int n)
	{
		  int r,sum=0,temp;    
          temp=n;    
          while(n>0){    
           r=n%10;  //getting remainder  
           sum=(sum*10)+r;    
           n=n/10;    
          }    
          if(temp==sum)    
                return true;
          else    
           return false; 
	}
	public static void main(String args[])
	{
	    int S,L;
	    Scanner sc=new Scanner(System.in);
	    S=sc.nextInt();
	    L=sc.nextInt();
	    for(int i=S;i<=L;i++)
	    {
	        if(isPal(i))
	        {
	            System.out.print(i+" ");
	        }
	    }
	}
}