package programs;

public class Number_Prime_Or_Not {
	public static void main(String[] args) {
		int a=17;
		for(int i=2; i<=a/2; i++) {
			if(a%i==0) {
				System.out.println("No is not prime");
				break;
				
			}
			else {
				System.out.println("No is prime");
				break;
			}
		}
	}

}
