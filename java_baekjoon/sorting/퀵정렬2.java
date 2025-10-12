import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퀵정렬2 {
    static int K, count;
    static boolean printed;
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

        K = k;
        quick_sort(A, 0, A.length - 1);

        if(!printed) {
            System.out.println(-1);
        }
        br.close();
    }
    
    private static void quick_sort(int A[], int p, int r) {
        if (printed) return;
        if(p < r) {
            int q = partition(A, p, r);
            if(printed) return;
            quick_sort(A, p, q - 1);
            if(printed) return;
            quick_sort(A, q + 1, r);
        }
    }

    private static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;

        for(int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
				i++;

				swap(A, i, j);
                count++;

                if(count == K) {
                    for(int y : A) {
                        System.out.print(y + " ");
                    }
                    printed = true;
                }
			}
        }

        if (i + 1 != r) {
            swap(A, i + 1, r);
            count++;

            if (!printed && count == K) {
                for(int y : A) {
                    System.out.print(y + " ");
                }
                printed = true;
            }
        }
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}