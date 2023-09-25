import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int count = 0;
        
        int datas[] = new int[x];
        for( int i = 0; i < datas.length; i++){
            datas[i] = scanner.nextInt();
        }

        for ( int i = 0; i < datas.length; i++){
            if(isPrime(datas[i])){
                count++;
            }
        }

        System.out.println(count);

        

        scanner.close();

        
    }
    static boolean isPrime(int x){
        if(x == 1) return false;

        for(int i= 2; i <  x ; i++) {

            if(x % i == 0) return false;
        }
        return true;
    }
}