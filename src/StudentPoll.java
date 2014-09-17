
//package gc.cs.comp1011.exceptions;
/*
 * Twenty students are asked to rate on a scale of 1(awful) to
 *  5 (excellent) the quality of food in the student cafeteria.
 *  Calculate the frequency of each rating
 */
public class StudentPoll {

	public static void main(String[] args) {
		//student response array
		int[] responses = {1,3,2,5,4,3,3,1,3,5,5,2,3,12,1,3,2,5,4,0};
		int[] frequency = new int[5];
		
		//count the various responses
		for(int answer=0; answer < responses.length ; answer++){
		try	{
			++frequency[responses[answer]-1];
					
		}
		catch (ArrayIndexOutOfBoundsException e){
		System.out.println("The response "+responses[answer] + " provided is invalid");
		
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		}//end for
		//print the frequencies
		System.out.println("Rating\t\tFrequency");
		for(int rating =0; rating < frequency.length ; rating++)
			System.out.printf("%d\t\t%d\n", rating+1, frequency[rating]);
		

	}

}

