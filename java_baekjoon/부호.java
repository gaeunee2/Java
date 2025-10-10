import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 부호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;

            for(int j = 0; j < n; j++) {
                BigInteger x = new BigInteger(br.readLine());
                sum = sum.add(x);
            }
            
            int s = sum.signum();
            if (s > 0) System.out.println("+");
            else if (s < 0) System.out.println("-");
            else System.out.println("0");
        }
        
        br.close();
    }
}