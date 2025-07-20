import java.util.Scanner;
public class 네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int rsltx = 0;
        int rslty = 0;

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        if(x3 == x2) {
            rsltx = x;
        }
        else if(x3 == x) {
            rsltx = x2;
        }
        else {
            rsltx = x3;
        }

        int y3 = sc.nextInt();
        if(y3 == y2) {
            rslty = y;
        }
        else if(y3 == y) {
            rslty = y2;
        }
        else {
            rslty = y3;
        }
        System.out.println(rsltx + " " + rslty);

        sc.close();
    }
}