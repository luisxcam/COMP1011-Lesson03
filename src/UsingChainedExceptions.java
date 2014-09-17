
/**
 * This class demonstartes chained exceptions
 * @author Anju Chawla
 * @version September, 2014
 */
public class UsingChainedExceptions
{
   public static void main(String[] args)
   {
      try 
      { 
         method1(); 
      } 
      catch (Exception exception) // exceptions thrown from method1
      { 
         exception.printStackTrace();
      } 
   } 

   // calls method 2; gets an exception thrown to it and throws exceptions back to main
   public static void method1() throws Exception
   {
      try 
      { 
         method2(); 
      }
      catch (Exception exception) // exception thrown from method2
      {
         throw new Exception("Exception thrown in method1", exception);
      }
   } // end method method1

   // calls method 3 and gets an exception thrown to it and throws exceptions back to method1
   public static void method2() throws Exception
   {
      try 
      { 
         method3(); 
      } 
      catch (Exception exception) // exception thrown from method3
      {
         throw new Exception("Exception thrown in method2", exception);
      } 
   } // end method method2

   // throw Exception back to method2
   public static void method3() throws Exception
   {
      throw new Exception("Exception thrown in method3");
   } 
} // end class UsingChainedExceptions
