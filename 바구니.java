import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class 바구니 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(i);
        }

        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int k = sc.nextInt();

            Collections.reverse(arr.subList(s - 1, k));
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        sc.close();
    }
}