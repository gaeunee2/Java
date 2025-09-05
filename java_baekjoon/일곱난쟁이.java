import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] height = new int[9];
        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
        }
        Arrays.sort(height);

        int total = 0;
        for (int h : height) total += h;

        int fake1 = -1, fake2 = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - height[i] - height[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if (fake1 != -1) break;
        }

        for (int i = 0; i < 9; i++) {
            if (i == fake1 || i == fake2) continue;
            System.out.println(height[i]);
        }

        sc.close();
    }
}