import java.util.Scanner;
public class 수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long s = sc.nextLong();
        
        int i = 1;
        long sum = 0;
        while(sum < s) {
            sum += i;

            if(sum >= s) {
                break;
            }
            i++;
        }

        if(sum == s) {
            System.out.println(i);
        }
        else {
            System.out.println(i - 1);
        }

        sc.close();
    }
}