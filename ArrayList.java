import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);

	        // Loop
	        ArrayList numbers = new ArrayList();

	        // Asks the user for 5 numbers
	        System.out.println("Please enter 5 numbers.");

	        int sum = 0;
	        int product = 1;

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Number " + (i + 1) + ": ");
	            int number = scan.nextInt();
	            numbers.add(number); // Stores them in an array list
	            sum += number;
	            product *= number;
	        }

	        // Finds the sum, product, largest, and smallest of those numbers
	        System.out.printf("\nArray: " + numbers + "\n");
	        System.out.println("Sum: " + sum);
	        System.out.println("Product: " + product);

	        // sort array
	     

	        System.out.println("Largest: " + numbers.get(numbers.size() - 1));
	        System.out.printf("Smallest: " + numbers.get(0) + "\n\n");
	        
	        // close
	        scan.close();

	    }

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(int number) {
		// TODO Auto-generated method stub
		
	}
	
	
}	




		       

