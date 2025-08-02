import java.util.Scanner;
public class ixDAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int problemsToImplement = 0;
        
        for(int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            if (petya + vasya + tonya >= 2) {
                problemsToImplement++;
            }
        }
        
        System.out.println(problemsToImplement);
        
        scanner.close();
    }
}
    
