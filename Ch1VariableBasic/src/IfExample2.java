import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		

		for (int i = 2; i<=(int)Math.sqrt(n); i++) {
		      if (n % i == 0) {
		          System.out.println("not prime number");
		      }
			}
			System.out.println("prime number");
			
		
	}

}
