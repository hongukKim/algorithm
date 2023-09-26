import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
 
		int s = scanner.nextInt();
		int count = 1; // 거리
		int range = 2;	// 범위
 
		if (s == 1) {
			System.out.print(1);
		} else {
			while (range <= s) {	// 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count);	// 다음 범위 구하기
				count++;	// count 1 증가 
			}
			System.out.print(count);
		}
	}
}