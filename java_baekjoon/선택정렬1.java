import java.util.Scanner;

public class 선택정렬1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        if (!printKthSwap(A, k)) {
            System.out.println(-1);
        }

        sc.close();
    }

    private static boolean printKthSwap(int[] A, int k) {
        int count = 0;
        for (int i = A.length - 1; i >= 1; i--) {
            int l = theLargest(A, i);
            if (l != i) {
                int first = A[l];
                int second = A[i];

                count++;
                if (count == k) {
                    System.out.println(second + " " + first);
                    return true;
                }
                int tmp = A[l];
                A[l] = A[i];
                A[i] = tmp;
            }
        }
        return false;
    }

    private static int theLargest(int[] A, int last) {
        int largest = 0;
        for (int i = 1; i <= last; i++) {
            if (A[i] > A[largest]) largest = i;
        }
        return largest;
    }
}