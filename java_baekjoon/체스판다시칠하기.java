import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minRepaint = Integer.MAX_VALUE;
        for (int row = 0; row <= N - 8; row++) {
            for (int col = 0; col <= M - 8; col++) {
                int repaintCount1 = 0; // Starting with 'W'
                int repaintCount2 = 0; // Starting with 'B'

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char expectedColor1 = ((i + j) % 2 == 0) ? 'W' : 'B';
                        char expectedColor2 = ((i + j) % 2 == 0) ? 'B' : 'W';

                        if (board[row + i][col + j] != expectedColor1) {
                            repaintCount1++;
                        }
                        if (board[row + i][col + j] != expectedColor2) {
                            repaintCount2++;
                        }
                    }
                }

                minRepaint = Math.min(minRepaint, Math.min(repaintCount1, repaintCount2));
            }
        }
        System.out.println(minRepaint);
        
        br.close();
    }
}
