import java.util.Arrays;
import java.util.Scanner;
public class 세막대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        if(arr[2] < arr[0] + arr[1]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        }
        else {
            arr[2] = arr[0] + arr[1] - 1;
            System.out.println(arr[0] + arr[1] + arr[2]);
        }

        sc.close();
    }
}