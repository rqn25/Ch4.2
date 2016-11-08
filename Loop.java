
public class Loop {
	public static void main(String [] args) {
		int k=1;
		do {
		if(k%2==1) {
		System.out.println(k);
		}
		k++;
		} while (k<=100);
		
		int k2=1;
		do {

		if(k2%2==1) {
		System.out.println(k2+1);
		}
		k2++;
		} while (k2<=100);
		
		System.out.println("  *");
		System.out.println(" ***");
		System.out.println("*****");
		System.out.println(" ***");
		System.out.println("  *");
	}
}
