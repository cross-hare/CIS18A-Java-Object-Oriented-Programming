package beerTest;

public class BeerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bottleStock = 99;
		String word = "bottles";
		
		//replaces "bottles" with "bottle" when there is only one bottle left
		while (bottleStock > 0)
		{
			if (bottleStock == 1)
				word = "bottle";
		
			System.out.println(bottleStock + " " + word + " of beer on the wall.");
			System.out.println(bottleStock + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			bottleStock = bottleStock - 1;
			
			if(bottleStock > 0)
				System.out.println(bottleStock + " " + word + " of beer on the wall.");
			else
				System.out.print("No more bottles of beer on the wall.");
			
			System.out.println();
		}//end while loop
	}//end main
}//end class
