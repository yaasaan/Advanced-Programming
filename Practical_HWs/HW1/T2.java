    //m^n The nth power of m is ...
import java.util.*;
public class T2 
{

    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      int m=input.nextInt();
      int n=input.nextInt();
      System.out.format("The %dth power of %d is %d \n",n,m,pow(m,n));
    }
    
    static int pow(int m,int n)
    {
        int pow=1;
        for (int i = 1; i <= n; i++)
        {
            pow=pow*m;
        }
        return pow;
    }
    
}
