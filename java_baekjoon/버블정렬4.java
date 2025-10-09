import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 버블정렬4 {
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

        long total = totalChangeCount(A);
        if(k > total) {
            System.out.println(-1);
            return;
        }

        if (!printKthSwap(A, k)) {
            System.out.println(-1);
        }

        br.close();
    }

    private static boolean printKthSwap(int[] A, int k) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;

                    count += 1;
                    if (count == k) {
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

    private static long totalChangeCount(int[] A) {
        int n = A.length;
        int[] copy = A.clone();
        int[] tmp = new int[n];
        return mergeSortCount(copy, tmp, 0, n - 1);
    }

    private static long mergeSortCount(int[] a, int[] t, int l, int r) {
        if (l >= r) {
            return 0;
        }

        int m = (l + r) >>> 1;
        long count = 0;

        count += mergeSortCount(a, t, l, m);
        count += mergeSortCount(a, t, m + 1, r);
        count += merge(a, t, l, m, r);

        return count;
    }

    private static long merge(int[] a, int[] t, int l, int m, int r) {
        int i = l, j = m + 1, k = l;
        long count = 0;

        while (i <= m && j <= r) {
            if (a[i] < a[j]) {
                t[k++] = a[i++];
            } 
            else {
                t[k++] = a[j++];
                count += (m - i + 1);
            }
        }
        while (i <= m) {
            t[k++] = a[i++];
        }
        while (j <= r) {
            t[k++] = a[j++];
        }

        for (int p = l; p <= r; p++) {
            a[p] = t[p];
        }
        return count;
    }
}