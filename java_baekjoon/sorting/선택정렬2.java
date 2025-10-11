import java.util.Scanner;

public class 선택정렬2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        if (!printKthArray(A, k)) {
            System.out.println(-1);
        }

        sc.close();
    }

    private static boolean printKthArray(int[] A, int k) {
        int count = 0;
        for (int i = A.length - 1; i >= 1; i--) {
            int l = theLargest(A, i);
            if (l != i) {
                int tmp = A[l];
                A[l] = A[i];
                A[i] = tmp;

                count++;
                if (count == k) {
                    for(int j = 0; j < A.length; j++) {
                        System.out.print(A[j] + " ");
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static int theLargest(int[] A, int last) {
        int largest = 0;
        for (int i = 1; i <= last; i++) {
            if (A[i] > A[largest]) {
                largest = i;
            }
        }
        return largest;
    }
}