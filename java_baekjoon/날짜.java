import java.util.Scanner;
public class 날짜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        String d[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int num = -1;

        for(int i = 1; i <= x; i++) {
            int day;
            if(i == 2) {
                day = 28;
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11) {
                day = 30;
            }
            else {
                day = 31;
            }

            if(i == x) {
                for(int j = 1; j <= y; j++) {
                    num++;
                    num %= 7;
                }
            }
            else {
                for(int j = 1; j <= day; j++) {
                    num++;
                    num %= 7;
                }
            }
        }
        System.out.println(d[num]);

        sc.close();
    }
}