import java.util.InputMismatchException;
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
    	//variable definition
        int numerator, denominator, result;
        boolean finished = true;
        
        //Start scanner
        Scanner scanner = new Scanner(System.in);
        
        do{
        	//User input
	        System.out.println("Please enter an integer numerator");
	        numerator = scanner.nextInt();
	        
	        System.out.println("Please enter an integer denominator");
	        denominator = scanner.nextInt();
	        
	        try{
	        	//do division, display result
		        result = quotient( numerator,  denominator);
		        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
		        finished = false;
	        }//try
	        
	        catch(InputMismatchException e){
	        	System.out.println("Invalid value provided. Non numeric value given.");
	        	System.out.println("Try again");
	        }//catch
	        
	        catch(ArithmeticException e){
	        	System.out.println("Cannot divide by 0");
	        	System.out.println("Try again.");
	        }//catch
	        
        }while(finished);//do
    }//main
}//class
