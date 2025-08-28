import java.util.Scanner;

public class xviiDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   // number of statements
        int x = 0;              // initial value of x = 0
        
        for (int i = 0; i < n; i++) {
            String statement = sc.next();
            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }
        
        System.out.println(x);
    }
}
