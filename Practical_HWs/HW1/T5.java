//Factorial
import java.util.*;
public class T5 
{

    public static void main(String[] args) 
    {
        Scanner input =new Scanner(System.in);
        int x= input.nextInt();
        
        System.out.format("%d\n",fac(x));
    }
    
    static long fac(int x)
    {
        if(x<=2)
            return x;
        return x*fac(x-1);
    }
    
}
