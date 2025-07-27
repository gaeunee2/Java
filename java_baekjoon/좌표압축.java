import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;

        for(int num : sorted) {
            if(!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(rankMap.get(num)).append(" ");
        }

        System.out.println(sb);
    }
}