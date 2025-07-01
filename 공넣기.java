import java.util.Scanner;
public class 공넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int z = s - 1; z < j; z++) {
                arr[z] = k;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}