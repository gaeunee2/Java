import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String line = br.readLine();
            if(line.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            boolean valid = true;
             for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') stack.push(c);
                else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        valid = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid && stack.isEmpty()) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.print(sb.toString());
    }
}