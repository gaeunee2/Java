import java.util.Scanner;
public class 블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, n, m));

        sc.close();
    }
    public static int search(int arr[], int n, int m) {
        int rslt = 0;

        for(int i = 0; i < n - 2; i++) {
            if(arr[i] > m) {
                continue;
            }
            for(int j = i + 1; j < n - 1; j++) {
                if(arr[i] + arr[j] > m) {
                    continue;
                }
                for(int k = j + 1; k < n; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];

                    if(tmp == m) {
                        return tmp;
                    }
                    if(rslt < tmp && tmp < m) {
                        rslt = tmp;
                    }
                }
            }
        }
        return rslt;
    }
}