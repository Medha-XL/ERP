package basicPrograms;

public class findLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
	    int b = 20;
		int c = 30;
		
		if(a>=b && a>=c ) {
			
			System.out.println("a is the largest number : " + a);
		}
	
		else if (b>=a && b>=c ){
			System.out.println("b is the largest number : " + b);
	}
		else {
		    System.out.println("c is the largest number : " + c);
		}


	}

}
