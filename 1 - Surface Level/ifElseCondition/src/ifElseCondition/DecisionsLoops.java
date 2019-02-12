package ifElseCondition;

public class DecisionsLoops {

	public static void main(String[] args) {
		int x = 15;
		
		System.out.println("This will keep looping until x is under 12!");
		System.out.println(x);
		
		while (x > 12)
		{
			x--;
			System.out.println(x);
			
			if(x > 12)
			{
				System.out.println("We need to loop again!");
			}
			else
			{
				System.out.println("Donzo");
			}
		}//end of while (x > 12)
	}//end of main
}//end of class DecisionsLoops
