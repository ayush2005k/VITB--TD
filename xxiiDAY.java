import java.util.*;

public class xxiiDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        // minimum steps = ceil(x / 5)
        int steps = (x + 4) / 5; // integer trick for ceiling division
        System.out.println(steps);
        
        sc.close();
    }
}
