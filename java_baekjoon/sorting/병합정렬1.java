import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병합정렬1 {
    static int K, count, answer = -1;
    static int[] tmp;

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
        tmp = new int[n];
        mSort(A, 0, n - 1);

        System.out.println(answer);
        br.close();
    }

    static void mSort(int[] A, int left, int right) {
        if (left >= right || answer != -1) {
            return;
        }

        int mid = (left + right) / 2;
        mSort(A, left, mid);
        mSort(A, mid + 1, right);
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
            A[i] = tmp[t++];
            if (++count == K) answer = A[i];
            i++;
        }
    }
}