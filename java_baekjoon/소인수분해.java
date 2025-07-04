import java.util.Scanner;
import java.util.ArrayList;
public class 소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        if(n != 1) {
            while(n != 1) {
                for(int i = 2; i <= n; i++) {
                    if(n % i == 0) {
                        arr.add(i);
                        n /= i;
                        break;
                    }
                }
            }
            for(int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }

        sc.close();
    }
}