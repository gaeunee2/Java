import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 힙정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] A = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        buildHeap(A);
        for(int i = A.length - 1; i >= 1; i--) {
            swap(A, 0, i);
            percolateDown(A, 0, i - 1);
        }

        //최종 정렬 결과
        for (int x : A) System.out.print(x + " ");
        System.out.println();

        br.close();
    }
    
    // 최대 힙 구성
    private static void buildHeap(int[] A) {
        int n = A.length - 1;
        if (n >= 1) {
            for (int i = (n - 1) / 2; i >= 0; i--) {
                percolateDown(A, i, n);
            }
        }
    }

    private static void percolateDown(int[] A, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left <= n) {
            if (right <= n && A[left] < A[right]) {
                left = right;
            }
            if (A[i] < A[left]) {
                swap(A, i, left);
                
                for(int x : A) {
                    System.out.print(x + " ");
                }
                System.out.println();
                percolateDown(A, left, n);
            }
        }
    }

    /* 반복으로 구현 (오버헤드 고려)
    private static void percolateDown(int[] A, int i, int n) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left > n) break;

            int child = left;
            if (right <= n && A[child] < A[right]) child = right;

            if (A[i] < A[child]) {
                swap(A, i, child);
                for(int x : A) {
                    System.out.print(x + " ");
                }
                System.out.println();

                i = child;
            }  else {
              break;
            }
        }
    }
    */

    private static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}