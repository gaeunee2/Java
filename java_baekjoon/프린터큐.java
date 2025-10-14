import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 프린터큐 {
    static class Doc {
        int priority, idx;
        Doc(int p, int i) { 
            priority = p; 
            idx = i; 
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Deque<Doc> q = new ArrayDeque<>();
            int[] freq = new int[10];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int p = Integer.parseInt(st.nextToken());
                q.addLast(new Doc(p, i));
                freq[p]++;
            }

            int printed = 0;
            int curMax = 9;
            while (!q.isEmpty()) {
                while (curMax > 0 && freq[curMax] == 0) curMax--;
                Doc d = q.peekFirst();
                if (d.priority == curMax) {
                    q.pollFirst();
                    freq[curMax]--;
                    printed++;
                    if (d.idx == M) {
                        out.append(printed).append('\n');
                        break;
                    }
                } else {
                    q.addLast(q.pollFirst());
                }
            }
        }

        System.out.print(out.toString());
        br.close();
    }
}