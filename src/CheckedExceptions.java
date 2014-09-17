import java.io.IOException;


public class CheckedExceptions {

	public static void main(String[] args) /*throws IOException*/ {
		try{
			m1();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	private static void m1() throws IOException{
		throw new IOException("IO Exception");
	}

}
