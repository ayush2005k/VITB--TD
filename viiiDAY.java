import java.util.Scanner;

public class viiiDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.length() > 10) {
                System.out.print(word.charAt(0));
                System.out.print(word.length() - 2);
                System.out.println(word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}