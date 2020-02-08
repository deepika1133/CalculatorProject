import java.util.*;
public class Calculator 
{
    public int Addition(int a, int b)
    {
        int c = a + b; 
        return c;
    }
    
   public int Subtract(int a, int b)
    {
        int c = a - b; 
        return c;
    }
      public int Multiply(int a, int b)
    {
        int c = a * b; 
        return c;
    }
      
     
       public int Divide(int a, int b)
    {
        int c;
        
	c = a / b;     
        return c;
    	
    }


    public static void main(String[] args) 
    {
        int a,b;
        String sign;
        
        Scanner sc= new Scanner(System.in);
        Calculator Cal = new Calculator();
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your operation (+, -, * or /)");
        sign = sc.next();
        if(sign.equals("+"))
        {
            int c = Cal.Addition(a, b);
            System.out.println("Answer is " + c);
        }
        else if(sign.equals("-"))
        {
            int c = Cal.Subtract(a, b);
            System.out.println("Answer is " + c);
        }
        else if(sign.equals("*"))
        {
            int c = Cal.Multiply(a, b);
            System.out.println("Answer is " + c);
        }
        else if(sign.equals("/"))
        {
            try
            {
            int c = Cal.Divide(a, b);
            System.out.println("Answer is " + c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("division by zero is not possible");
            }
        }
        else
            System.out.println("Invalid sign");


    }
}





