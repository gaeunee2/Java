import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int next = 1;
        int idx = 0;

        while (next <= n) {
            stack.push(next++);
            sb.append("+\n");

            while (!stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
                if (idx == n) break;
            }
        }

        if (idx != n) System.out.println("NO");
        else System.out.print(sb.toString());

        sc.close();
    }
}