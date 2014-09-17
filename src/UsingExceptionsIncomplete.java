
/**
 * This class UsingExceptionsIncomplete demonstrates obtaining data from an Exception object using stack unwinding.
 * It does not compile since Exceptions have not been handled-or-declared as required for checked exceptions.
 * 
 * @author Anju Chawla
 * @version September, 2014
 */
public class UsingExceptionsIncomplete
{
   public static void main(String[] args)
   {
       method1();
    }
    
    public static void method1()
    {
        method2();
    }
     public static void method2()
    {
        method3();
    }
     public static void method3()
    {
       throw new Exception("Exception thrown in method 3");
    }
    
}
