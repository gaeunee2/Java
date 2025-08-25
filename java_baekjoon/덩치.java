import java.util.Scanner;
public class 덩치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[][] = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int rank[] = new int[n];
        for(int i = 0; i < n; i++) rank[i] = 1;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
                    rank[j] += 1;
                }
                else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank[i] += 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }

        sc.close();
    }
}