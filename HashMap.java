import java.util.*;
public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scan = new Scanner(System.in);

		        HashMap<String, String> car = new HashMap();

		        // The model is the Key, the make is the Value.
		        car.put("A7", "Audi");
		        car.put("S-class", "Mercedes-Benz");
		        car.put("745", "Bmw");
		        car.put("Cayene", "Porshe");
		        car.put("BENTAYGA", "Bentley");

		        // Ask the customer what car (model) they are looking for.
		        System.out.println("Search model: ");
		        String model = scan.nextLine().toUpperCase(); // Put input in all CAPS for consistency with the key
		        
		        // Use the Hash Map to determine if you have that vehicle, and what make it is.
		        if (car.containsKey(model)) {
		            System.out.println("Make: " + car.get(model));
		        } else {
		            System.out.println("Sorry, not here!");
		        }

		        // close
		        scan.close();
		    }
		
}


