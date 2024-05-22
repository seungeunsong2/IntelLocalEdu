import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int n = scan.nextInt();
		
		if (n % 4 == 0 && n % 400 == 0) {
			System.out.println("윤년");
		}else if (n % 100 == 0) {
			System.out.println("윤년아님");
		
		}else {
			System.out.println("윤년아님");
		}
			
			
		
	}

}
