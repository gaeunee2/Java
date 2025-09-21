import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 중복빼고정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        bw.write(arr[0] + "\n");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                bw.write(arr[i] + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
