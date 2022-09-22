import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char [] arr = input.toCharArray();
        int sum=0;
        for(char i: arr){
            if(Character.isDigit(i)){
                int a = Integer.parseInt(String.valueOf(i));
                sum+=a;
            }
        }
        System.out.println(sum);
    }
}