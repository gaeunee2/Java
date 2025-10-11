import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 선택정렬3 {
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

        if (!printKthSwap(A, k)) {
            System.out.println(-1);
        }
        br.close();
    }

    private static boolean printKthSwap(int[] A, int k) {
        int[] S = Arrays.copyOf(A, A.length);
        Arrays.sort(S);

        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            pos.put(A[i], i);
        }

        int count = 0;
        for (int i = A.length - 1; i >= 1; i--) {
            int target = S[i];
            int l = pos.get(target);

            if (l != i) {
                int first = A[l];
                int second = A[i];

                A[l] = second;
                A[i] = first;

                pos.put(second, l);
                pos.put(first, i);

                count++;
                if (count == k) {
                    System.out.println(second + " " + first);
                    return true;
                }
            }
        }
        return false;
    }
}