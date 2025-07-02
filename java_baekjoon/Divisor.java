import java.util.ArrayList;
import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        num = sc.nextInt();

        while(num != -1) {
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 1; i < num; i++) {
                if(num % i == 0) {
                    sum += i;
                    arr.add(i);
                }
            }
            if(sum == num) {
                System.out.print(num + " = " );
                for(int i = 0; i < arr.size() - 1; i++) {
                    System.out.print(arr.get(i) + " + ");
                }
                System.out.println(arr.get(arr.size() - 1));
            }
            else {
                System.out.println(num + " is NOT perfect.");
            }
            num = sc.nextInt();
        }
        sc.close();
    }
}