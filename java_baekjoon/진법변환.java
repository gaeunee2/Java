import java.util.Scanner;
public class 진법변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int b = sc.nextInt();

        int num = 1;
        int rslt = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                rslt += (s.charAt(i) - '0') * num;
                num *= b;
            }
            else {
                rslt += (s.charAt(i) - 'A' + 10) * num;
                num *= b;
            }
        }
        System.out.println(rslt);

        sc.close();
    }
}