import java.util.Scanner;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s = sc.next();

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - 'a' + 1) * Math.pow(31, i);
        }
        System.out.println(sum);

        sc.close();
    }
}