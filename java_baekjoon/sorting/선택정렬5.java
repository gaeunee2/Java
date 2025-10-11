import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 선택정렬5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        if(selection_sort(A, B)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        br.close();
    }
    
    private static boolean selection_sort(int[] A, int[] B) {
        if(Arrays.equals(A, B)) {
            return true;
        }
        for(int i = A.length - 1; i > 0; i--) {
            int l = theLargest(A, i);

            if(i != l) {
                int tmp = A[i];
                A[i] = A[l];
                A[l] = tmp;
            }
            if(Arrays.equals(A, B)) {
                return true;
            }
        }
        return false;
    }

    private static int theLargest(int[] A, int last) {
        int largest = 0;
        for(int i = 1; i <= last; i++) {
            if(A[largest] < A[i]) {
                largest = i;
            }
        }
        return largest;
    }
}
