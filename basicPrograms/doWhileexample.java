package basicPrograms;

public class doWhileexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		do {
			
			if(i%2 == 0) {
				System.out.println("The number is even: " + i);
			}
			i++;
		}while (i<=10);

	}

}
