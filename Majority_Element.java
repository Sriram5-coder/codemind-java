import java.util.*;
class Sample
{
    public static int findMajorityElement(int x[])
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int key=0;
        for(int i=0;i<x.length;i++)
        {
            if(!hm.containsKey(x[i]))
               hm.put(x[i],new Integer(1));
            else
               hm.put(x[i],new Integer((int)hm.get(x[i])+1));
        }
        int n=(int)x.length/2;
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            int l=(int)e.getKey();
            
             if((int)hm.get(l)>n)
              {
                key=l;
                break;
              }
        }
        return key;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int c=findMajorityElement(x);
        System.out.println(c);
        sc.close();
    }
}