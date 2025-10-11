import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 버블정렬3 {
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

        System.out.println(bubble_sort_check(A, B) ? "1" : "0");

        br.close();
    }

    private static boolean bubble_sort_check(int[] A, int[] B) {
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
        for(int i = 0; i < l - 1; i++) {
            boolean swapped = false;

            for(int j = 0; j < A.length - 1 - i; j++) {
                if(A[j] > A[j + 1]) {
                    int first = A[j];
                    int second = A[j + 1];

                    A[j] = second;
                    A[j + 1] = first;

                    if(first == B[j] && A[j] != B[j]) {
                        diff++;
                    }
                    if(second == B[j + 1] && A[j + 1] != B[j + 1]) {
                        diff++;
                    }
                    if(first != B[j] && A[j] == B[j]) {
                        diff--;
                    }
                    if(second != B[j + 1] && A[j + 1] == B[j + 1]) {
                        diff--;
                    }

                    if(diff == 0) {
                        return true;
                    }

                    swapped = true;     
                }
            }
            if(!swapped) {
                break;
            }
        }
        return false;
    }
}