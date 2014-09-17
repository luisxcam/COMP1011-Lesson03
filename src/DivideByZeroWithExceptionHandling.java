

/**
 * This class DivideByZeroNoExceptionHandling divides two integers and stops abnormally when the denominator is zero .
 * 
 * @author Luis Acevedo
 * @version September 2014
 */
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
    public static int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
    
    public static void main(String[] args)
    {
        int numerator, denominator, result;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter an integer numerator");
        numerator = scanner.nextInt();
        
        System.out.println("Please enter an integer denominator");
        denominator = scanner.nextInt();
        
        try{
        result = quotient( numerator,  denominator);
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
        }
        catch(ArithmeticException e){
        	System.out.println("Cannot make a division with ZERO as a denominator");
        }
    }
}
