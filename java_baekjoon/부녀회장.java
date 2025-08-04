import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 부녀회장 {
    static int arr[][] = new int[15][15];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= 14; i++) {
            arr[0][i] = i;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[k][n]);
        }
    }
}