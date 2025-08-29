import java.util.*;

public class xxiDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of children
        int t = sc.nextInt(); // seconds
        String s = sc.next(); // initial arrangement
        char[] arr = s.toCharArray();

        // simulate t seconds
        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    // swap B and G
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++; // skip next index (already swapped)
                }
            }
        }

        System.out.println(new String(arr));
    }
}
