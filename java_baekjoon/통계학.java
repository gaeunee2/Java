import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class 통계학 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);
        int avg = (int)Math.round((double)sum / n);

        System.out.println(avg);
        System.out.println(arr[n / 2]);
        
        int maxFreq = Collections.max(freq.values());
        ArrayList<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }
        Collections.sort(modeList);
        if (modeList.size() == 1) {
            System.out.println(modeList.get(0));
        } else {
            System.out.println(modeList.get(1));
        }

        System.out.println(arr[n - 1] - arr[0]);

        sc.close();
    }
}