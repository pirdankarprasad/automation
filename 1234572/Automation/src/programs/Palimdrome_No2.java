package programs;

public class Palimdrome_No2 {
public static void main(String [] args) {
	int num=1234321;
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
	System.out.println("No is palimdrome");
	
}
else {
	System.out.println("No is not palimdrome");
}

}
}