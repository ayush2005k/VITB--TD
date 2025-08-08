import java.util.Scanner;

public class xiDAY {
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        
        String petya = myobj.nextLine();
        String noVowels ="";
        

        for (int i = 0; i < petya.length(); i++) {
            
            if (petya.charAt(i) != 'a' && petya.charAt(i) != 'e' && petya.charAt(i) != 'i' && petya.charAt(i) != 'o' && petya.charAt(i) != 'u' &&
                petya.charAt(i) != 'A' && petya.charAt(i) != 'E' && petya.charAt(i) != 'I' && petya.charAt(i) != 'O' && petya.charAt(i) != 'U') {
                
                noVowels += petya.charAt(i);
            }
        }
        System.out.println("string without vowls : " + noVowels);

        String withdot = noVowels.replaceAll("(.)", ".$1");
        System.out.println("string  with dot:" + withdot);

        String lowerwithdot = withdot.toLowerCase();
        System.out.println("string with lower case :" + lowerwithdot);
        myobj.close();
   
    }

}
