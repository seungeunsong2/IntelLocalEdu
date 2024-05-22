
public class DiceTemp {

	public static void main(String[] args) {
		
		int cnt = 0;
		for(;;) {
			int diceNum = (int)(Math.random() * 6) + 1;
				System.out.println("(" + diceNum + ")");
			cnt += 1;
			if(diceNum == 6) {
				break;
			}
		}
			System.out.println("총 주사위 굴린 횟수는: " + cnt);
		}
		
}
	


