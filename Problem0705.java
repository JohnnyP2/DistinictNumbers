// Johnny Pedicone
import java.util.Scanner;;
public class Problem0705 {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int[] distinct = new int[10];
		int number;
		int numOfDistinct = 0;
		
		System.out.println("Enter the numbers");
		for(int i = 0; i<10;i++) 
		{
			number = key.nextInt();
			if(isNumDistinct(distinct, number))
			{
				distinct[numOfDistinct] = number;
				numOfDistinct++;
				
			}
			
			
			
		}
		System.out.println("There are " + numOfDistinct + "distinct numbers");
		System.out.println("These are the distinct numbers ");
		for(int i = 0; i < distinct.length; i++) 
		{
			if(distinct[i] > 0) 
			{
				System.out.print(distinct[i] + " ");
			}
			
			
			
		}
		
		
		
		
		

	}

	public static boolean isNumDistinct(int theNumbers[], int number) // Checks if the number is a distinct number
	{
		for(int i = 0; i< theNumbers.length; i++) 
		{
			if(number == theNumbers[i]) 
			{
				return false;
			}
			
			
		}
	
	return true;
	}
}