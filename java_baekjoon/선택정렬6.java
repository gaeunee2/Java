import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 선택정렬6 {
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

        System.out.println(selection_sort_check(A, B) ? "1" : "0");

        br.close();
    }

    private static boolean selection_sort_check(int[] A, int[] B) {
        int diff = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) {
                diff += 1;
            }
        }
        if(diff == 0) {
            return true;
        }

        int[] S = Arrays.copyOf(A, A.length);
        Arrays.sort(S);

        Map<Integer, Integer> pos = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            pos.put(A[i], i);
        }
        for(int i = A.length - 1; i >= 1; i--) {
            int target = S[i];
            int l = pos.get(target);

            if(i != l) {
                int first = A[i];
                int second = A[l];

                A[i] = second;
                A[l] = first;

                pos.put(second, i);
                pos.put(first, l);

                if(first == B[i] && A[i] != B[i]) {
                    diff += 1;
                }
                if(first != B[i] && A[i] == B[i]) {
                    diff -= 1;
                }
                if(second == B[l] && A[l] != B[l]) {
                    diff += 1;
                }
                if(second != B[l] && A[l] == B[l]) {
                    diff -= 1;
                }
            }
            if(diff == 0) {
                return true;
            }
        }
        return false;
    }
}