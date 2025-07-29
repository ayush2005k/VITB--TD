import java.util.HashMap;
import java.util.Map;

// This is the class that contains the main method and matches the file name.
public class vDAY {

    // The Solution class for the actual romanToInt logic.
    // It is not 'public' because 'vDAY' is the public class in this file.
    static class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            int result = 0;
            int n = s.length();

            for (int i = 0; i < n - 1; i++) {
                int currentValue = romanMap.get(s.charAt(i));
                int nextValue = romanMap.get(s.charAt(i + 1));

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            }

            result += romanMap.get(s.charAt(n - 1));

            return result;
        }
    }

    // The main method to run and test the Roman numeral conversion.
    public static void main(String[] args) {
        Solution converter = new Solution(); // Create an instance of your Solution class

        System.out.println("III -> " + converter.romanToInt("III"));
        System.out.println("LVIII -> " + converter.romanToInt("LVIII"));
        System.out.println("MCMXCIV -> " + converter.romanToInt("MCMXCIV"));
        System.out.println("IV -> " + converter.romanToInt("IV"));
        System.out.println("IX -> " + converter.romanToInt("IX"));
    }
}