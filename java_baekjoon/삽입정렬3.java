import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삽입정렬3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(insertion_sort_check(A, B) ? "1" : "0");


        br.close();
    }

    private static boolean insertion_sort_check(int[] A, int[] B) {
        int l = A.length;
        int diff = 0;

        for(int i = 0; i < l; i++) {
            if(A[i] != B[i]) {
                diff++;
            }
        }
        if(diff == 0) {
            return true;
        }

        for(int i = 1; i < A.length; i++) {
            int loc = i - 1;
            int newItem = A[i];

            while(loc >= 0 && newItem < A[loc]) {
                int origin = A[loc + 1];
                A[loc + 1] = A[loc];

                if(origin == B[loc + 1] && A[loc + 1] != B[loc + 1]) {
                    diff++;
                }
                if(origin != B[loc + 1] && A[loc + 1] == B[loc + 1]) {
                    diff--;
                }
                if(diff == 0) {
                    return true;
                }

				loc--;
			} 
			if (loc + 1 != i) {
                int origin = A[loc + 1];
                A[loc + 1] = newItem;

                if(origin == B[loc + 1] && A[loc + 1] != B[loc + 1]) {
                    diff++;
                }
                if(origin != B[loc + 1] && A[loc + 1] == B[loc + 1]) {
                    diff--;
                }
                if(diff == 0) {
                    return true;
                }
            } 
            else {
                A[loc + 1] = newItem;
            }
        }
        return false;
    }
}