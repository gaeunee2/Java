import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삽입정렬6 {
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
        int n = A.length;
        
        int endIdx = n - 1;
        while (endIdx >= 0 && A[endIdx] == B[endIdx]) {
            endIdx--;
        }
        
        if (endIdx < 0) return true;
        
        int diff = 0;
        for (int i = 0; i <= endIdx; i++) {
            if (A[i] != B[i]) diff++;
        }
        
        if (diff == 0) return true;
        
        for (int i = 1; i <= endIdx + 1 && i < n; i++) {
            int loc = i - 1;
            int newItem = A[i];
            
            while (loc >= 0 && newItem < A[loc]) {
                int targetIdx = loc + 1;

                if (targetIdx <= endIdx) {
                    if (A[targetIdx] == B[targetIdx]) diff++;
                    else if (A[loc] == B[targetIdx]) diff--;
                }
                
                A[targetIdx] = A[loc];
                
                if (diff == 0) return true;

                loc--;
            }
            
            int insertIdx = loc + 1;
            if (insertIdx != i) {
                if (insertIdx <= endIdx) {
                    if (A[insertIdx] == B[insertIdx]) diff++;
                    else if (newItem == B[insertIdx]) diff--;
                }
                
                A[insertIdx] = newItem;
                
                if (diff == 0) return true;
            }
        }
        return false;
    }
}