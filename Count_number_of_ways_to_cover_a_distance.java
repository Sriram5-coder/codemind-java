
import java.util.Scanner;

class Sample
{
	static int countNum(int dist)
	{
		if (dist<0)
			return 0;
		if (dist==0)
			return 1;

		return countNum(dist-1) +
			countNum(dist-2) +
			countNum(dist-3);
	}

	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int dist=sc.nextInt();
		System.out.println(countNum(dist));
	}
}
