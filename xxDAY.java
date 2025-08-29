import java.util.*;

public class xxDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }

        Arrays.sort(a); // ascending
        int taken = 0, cnt = 0;

        // take from largest to smallest until taken > total - taken
        for (int i = n - 1; i >= 0; i--) {
            taken += a[i];
            cnt++;
            if (taken > total - taken) break;
        }

        System.out.println(cnt);
        sc.close();
    }
}
