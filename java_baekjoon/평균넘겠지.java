import java.util.Scanner;
public class 평균넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int score[] = new int[n];
            int sum = 0;

            for(int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = (double)sum / n;
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(score[j] > avg) {
                    count += 1;
                }
            }
            double percent = (double)count / n * 100;
            System.out.println(String.format("%.3f%%", percent));
        }

        sc.close();
    }
}
