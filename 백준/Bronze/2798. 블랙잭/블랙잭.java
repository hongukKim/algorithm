
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 카드의 개수
        int M = scanner.nextInt(); // 딜러가 외친 수

        int [] arr = new int [N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int tmp= 0;
        int sum = 0;
        for (int i=0; i < N - 2; i++){
            for ( int j = i + 1  ; j < N - 1; j ++ ) {
                for ( int k = j+ 1 ; k < N; k ++ ) {
                    sum = arr[i] + arr[j] + arr[k];

                    if(tmp < sum && sum <= M){
                        tmp = sum;
                    }
                }
            }
        } 
        System.out.println(tmp);
        scanner.close();
	}
}