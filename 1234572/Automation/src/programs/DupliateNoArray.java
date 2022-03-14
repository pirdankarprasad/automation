package programs;

public class DupliateNoArray {
	public static void main(String [] args) {
		int ar[]= {10,20,10,30,40,50,50};
		for (int i=0; i<=ar.length-1; i++) {
			for(int j=i+1; j<=ar.length-1; j++) {
				if (ar[i]==ar[j]) {
					System.out.println("This no is duplicate="+ar[i]);
					
				}
			}
		}
		
	}

}
