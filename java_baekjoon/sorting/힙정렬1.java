import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 힙정렬1 {
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
        
        buildHeap(A);
        for(int i = A.length - 1; i >= 1; i--) {
            swapWithCount(A, 0, i);   
            if (printed) return;
            percolateDown(A, 0, i - 1);
        }

        if(!printed) {
            System.out.println(-1);
        }
        br.close();
    }
    
    // 최소 힙 구성
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
            if (right <= n && A[right] < A[left]) {
                left = right;
            }
            if (A[i] > A[left]) {
                swapWithCount(A, i, left);
                if(printed) return;
                percolateDown(A, left, n);
            }
        }
    }

    private static void swapWithCount(int[] A, int i, int j) {
        int x = A[i], y = A[j];

        int tmp = A[i]; 
        A[i] = A[j]; 
        A[j] = tmp;

        count++;
        if (count == K) {
            if (x <= y) {
                System.out.println(x + " " + y);
            }
            else {
                System.out.println(y + " " + x);
            }
            printed = true;
        }
    }
}