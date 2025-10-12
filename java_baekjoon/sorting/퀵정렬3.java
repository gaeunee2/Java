import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퀵정렬3 {
    static int diff;
    static int[] B;
    static boolean printed;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        B = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            if(A[i] != B[i]) {
                diff++;
            }
        }

        if(diff == 0) {
            System.out.println(1);
            return;
        }

        quick_sort(A, 0, A.length - 1);

        if (!printed) {
            System.out.println(0);
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
                int before1 = A[i];
                int before2 = A[j];

				swap(A, i, j);

                if(before1 == B[i] && A[i] != B[i]) {
                    diff++;
                }
                else if(before1 != B[i] && A[i] == B[i]) {
                    diff--;
                }
                if(before2 == B[j] && A[j] != B[j]) {
                    diff++;
                }
                else if(before2 != B[j] && A[j] == B[j]) {
                    diff--;
                }

                if(diff == 0) {
                    System.out.println(1);
                    printed = true;
                }
			}
        }

        if (i + 1 != r) {
            int before1 = A[i + 1];
            int before2 = A[r];

            swap(A, i + 1, r);
            
            if(before1 == B[i + 1] && A[i + 1] != B[i + 1]) {
                diff++;
            }
            else if(before1 != B[i + 1] && A[i + 1] == B[i + 1]) {
                diff--;
            }
            if(before2 == B[r] && A[r] != B[r]) {
                    diff++;
            }
            else if(before2 != B[r] && A[r] == B[r]) {
                    diff--;
            }

            if(!printed && diff == 0) {
                System.out.println(1);
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