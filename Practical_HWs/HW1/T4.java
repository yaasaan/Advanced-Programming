import java.util.*;
public class T4 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(conv(x));
    }
    
    static String conv (int x)
    {
        String lett1="";
        String lett2="";
        String lett3="";
        String lettf="";
        
          //hundreds
        int t=x/100;
        switch (t)
        {
            case 1:
                lett1="One Hundred ";break;
            case 2:
                lett1="Two Hundred ";break;
            case 3:
                lett1="Three Hundred ";break;
            case 4:
                lett1="Four Hundred ";break;
            case 5:
                lett1="Five Hundred ";break;
            case 6:
                lett1="Six Hundred ";break;
            case 7:
                lett1="Seven Hundred ";break;
            case 8:
                lett1="Eight Hundred ";break;
            case 9:
                lett1="Nine Hundred ";break;
        } 
        
        if(x%100 == 0 && x!=0)
            return lett1;
        
        //10-90
        int w=(x%100)/10;
        int y=x%10;
        
        outer : switch(w)
        {
            case 1:
                //10-19
                switch(y)
                {
                    case 0:
                        lett2= lett1+"Ten";break outer;
                    case 1:
                        lett2= lett1+"Eleven ";break outer;
                    case 2:
                        lett2= lett1+"Twelve ";break outer;
                    case 3:
                        lett2= lett1+"Thirteen ";break outer;
                    case 4:
                        lett2= lett1+"Fourteen ";break outer;
                    case 5:
                        lett2= lett1+"Fifteen ";break outer;
                    case 6:
                        lett2= lett1+"Sixteen ";break outer;
                    case 7:
                        lett2= lett1+"Seventeen ";break outer;
                    case 8:
                        lett2= lett1+"Eighteen ";break outer;
                    case 9:
                        lett2= lett1+"Nineteen ";break outer;
                }
            case 2:
                lett3= lett1+"Twenty ";break;
            case 3:
                lett3= lett1+"Thirty ";break;
            case 4:
                lett3= lett1+"Forty ";break;
            case 5:
                lett3= lett1+"Fifty ";break;
            case 6:
                lett3= lett1+"Sixty ";break;
            case 7:
                lett3= lett1+"Seventy ";break;
            case 8:
                lett3= lett1+"Eighty ";break;
            case 9:
                lett3= lett1+"Ninety  ";break; 
        }
        
        if( w==1&&x!=0 )
            return lett2;
        if(y==0 && x!=0 )
            return lett3;
        
        if((x/10)%10==0)
            lett3=lett1;
        
        if ( (x%100 >= 20) || (x%100 <=9) ) 
        {
            switch(y)
            {
                case 0:
                    lettf = lett3 + "Zero "; break;
                case 1:
                    lettf = lett3 + "One "; break;
                case 2:
                    lettf = lett3 + "Two "; break;
                case 3:
                    lettf = lett3 + "Three "; break;
                case 4:
                    lettf = lett3 + "Four "; break;
                case 5:
                    lettf = lett3 + "Five "; break;
                case 6:
                    lettf = lett3 + "Six "; break;
                case 7:
                    lettf = lett3 + "Seven "; break;
                case 8:
                    lettf = lett3 + "Eight "; break;
                case 9:
                    lettf = lett3 + "Nine "; break;
            }
            
        }
        return lettf;
    }
}
