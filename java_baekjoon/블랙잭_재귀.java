import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 블랙잭_재귀 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        int[] data = new int[n];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            data[i] = Integer.parseInt(split[i]);
        }

        int answer = go(0, 0, 0, data, m);
        System.out.println(answer);
    }

    static int go(int count, int sum, int nowIndex, int[] data, int m) {
        //불가능한 경우
        if (sum > m) {
            return -1;
        }
        //3개가 된 경우
        else if (count == 3) {
            return sum;
        }
        else if (nowIndex >= data.length) {
            return -1;
        }
        // 재귀 호출
        else {
            int answer = 0;
            //더하는 경우
            int a1 = go(count + 1, sum + data[nowIndex], nowIndex + 1, data, m);

            //안더하는경우
            int a2 = go(count, sum, nowIndex + 1, data, m);
            answer = Math.max(a1, a2);

            return answer;
        }
    }
}