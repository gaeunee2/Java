import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class solvedac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int del = (int)Math.round(n * 0.15);

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        double sum = 0;
        for(int i = del; i < n - del; i++) {
            sum += arr[i];
        }
        int rslt = (int)Math.round(sum / (n - del * 2));
        System.out.println(rslt);
    }
}