import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 병합정렬3 {
    static int diff;
    static int[] tmp;
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

        tmp = new int[n];
        mSort(A, 0, n - 1);

        if (!printed) {
            System.out.println(0);
        }
        br.close();
    }

    static void mSort(int[] A, int left, int right) {
        if (left >= right || printed) {
            return;
        }

        int mid = (left + right) / 2;
        mSort(A, left, mid);
        if (printed) return;
        mSort(A, mid + 1, right);
        if (printed) return;
        merge(A, left, mid, right);
    }

    static void merge(int[] A, int left, int mid, int right) {
        int i = left, j = mid + 1, t = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            }
            else {
                tmp[t++] = A[j++];
            }
        }
        while (i <= mid) {
            tmp[t++] = A[i++];
        }
        while (j <= right) {
            tmp[t++] = A[j++];
        }

        i = left; 
        t = 0;
        while (i <= right) {
            int origin = A[i];
            A[i] = tmp[t++];

            if(origin == B[i] && A[i] != B[i]) {
                diff++;
            }
            else if(origin != B[i] && A[i] == B[i]) {
                diff--;
            }

            if(diff == 0) {
                System.out.println(1);
                printed = true;
                return;
            }
            i++;
        }
    }
}