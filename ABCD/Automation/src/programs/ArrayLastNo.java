package programs;

import java.util.Arrays;

public class ArrayLastNo {
	public static void main(String [] args) {
		int ar[]= {10,40,70,80,90,101,102,105,107,79,85,58,65,45,87};
		Arrays.sort(ar);
		System.out.println(ar[ar.length-1]);
		
		
	}

}
