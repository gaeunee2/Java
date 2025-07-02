import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        int sum = 0;
        int index = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') {
                index = i;
                continue;
            }
            int num = str.charAt(i) - '0';
            if(i % 2 == 0) {
                sum += num;
            }
            else {
                sum += num * 3;
            }
        }

        int result = 0;
        if (index % 2 == 0) {
            result = (10 - (sum % 10)) % 10;
        } else {
            for (int x = 0; x < 10; x++) {
                if ((sum + x * 3) % 10 == 0) {
                    result = x;
                    break;
                }
            }
        }
        System.out.println(result);

        s.close();
    }
}