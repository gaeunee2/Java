import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 버블정렬1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] A = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        if (!printKthSwap(A, k)) {
            System.out.println(-1);
        }

        br.close();
    }

    private static boolean printKthSwap(int[] A, int K) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;

                    count += 1;
                    if (count == K) {
                        System.out.println(A[j] + " " + A[j + 1]);
                        return true;
                    }
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return false;
    }
}