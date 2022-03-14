package programs;

public class Palimdrome_No {
	public static void main(String[] args) {
		int num=12321;
		int givennum=num;
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println(sum);
	
	if(givennum==sum) {
		System.out.println("Number is  palimdrome");
	}
	else {
		System.out.println("Number is not palimdrome");
	}
		
		
	}

}
