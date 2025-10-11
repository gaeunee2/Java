import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삽입정렬2 {
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
        int count = 0;
        for(int i = 1; i < A.length; i++) {
            int loc = i - 1;
            int newItem = A[i];

            while(loc >= 0 && newItem < A[loc]) {
                A[loc + 1] = A[loc];
                count++;

                if(count == k) {
                    for(int x : A) {
                        System.out.print(x + " ");
                    }
                    return true;
                }
				loc--;
			} 
			if (loc + 1 != i) {
                A[loc + 1] = newItem;
                count++;
                if (count == k) {
                    for(int x : A) {
                        System.out.print(x + " ");
                    }
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