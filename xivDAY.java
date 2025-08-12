import java.util.Scanner;
 
public class xivDAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the single word from the input
        String word = scanner.nextLine();
        
        // Capitalize the first letter and append the rest of the word
        String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
        
        // Print the capitalized word
        System.out.println(capitalizedWord);
        
        scanner.close();
    }

}

