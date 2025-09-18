import java.util.Arrays;
import java.util.Scanner;

public class 세수정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}