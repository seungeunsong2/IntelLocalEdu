import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int a = 0;
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int n = scan.nextInt();
			a += n;
			System.out.println("누적 숫자: " + a);
			System.out.println();
			}
			
		
	}

}
