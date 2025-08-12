public class 셀프넘버 {
    public static void main(String[] args) {

        boolean[] generated = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int g = d(i); 
            if (g <= 10000) generated[g] = true;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!generated[i]) System.out.println(i);
        }
    }
    
    static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}