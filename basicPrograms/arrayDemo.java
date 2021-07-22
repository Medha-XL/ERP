package basicPrograms;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"BMW", "Maruti", "AUDI", "Volvo"};
		
		System.out.println("Car name is " + cars[1]);
		
		System.out.println("The length of the array is " + cars.length);
		//This for loop will display all the elements in an Array
		for(int i=0; i<cars.length; i++ ) {
			
			System.out.println("** The Car name is : " + cars[i]);
		}
		
		for (String i : cars) {
			
			System.out.println("The car name is : " + i);
		}

	}

}
