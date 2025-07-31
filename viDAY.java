import java.util.Stack; 

class Solution { 

    public boolean isValid(String s) {
      
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the input string 's'
        for (char ch : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If the character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // Case 1: If the stack is empty, it means we encountered a closing
                // bracket without a corresponding opening bracket. Invalid.
                if (stack.isEmpty()) {
                    return false;
                }

                // Case 2: Pop the top element from the stack. This should be the
                // most recently opened bracket.
                char lastOpen = stack.pop();

                // Case 3: Check if the current closing bracket matches the
                // type of the 'lastOpen' bracket. If not, it's an invalid match.
                if (ch == ')' && lastOpen != '(') {
                    return false;
                }
                if (ch == '}' && lastOpen != '{') {
                    return false;
                }
                if (ch == ']' && lastOpen != '[') {
                    return false;
                }
            }
            // Optional: If you only expect the given characters and nothing else,
            // you might want to add an 'else' here to handle unexpected characters.
            // For this specific problem, we assume only the six given characters.
        }

        // After iterating through the entire string:
        // If the stack is empty, it means all opening brackets found their
        // corresponding closing brackets in the correct order. The string is valid.
        // If the stack is not empty, it means there are unmatched opening brackets.
        // The string is invalid.
        return stack.isEmpty();
    }

    // You can use a main method for local testing if needed, similar to your previous code
    public static void main(String[] args) {
        Solution sol = new Solution(); // Create an instance of the Solution class

        System.out.println("Test cases:");
        System.out.println("\"()\": " + sol.isValid("()"));         // true
        System.out.println("\"()[]{}\": " + sol.isValid("()[]{}")); // true
        System.out.println("\"(]\": " + sol.isValid("(]"));         // false
        System.out.println("\"([]): " + sol.isValid("([])"));       // true
        System.out.println("\"([)]\": " + sol.isValid("([)]"));     // false
        System.out.println("Empty string \"\": " + sol.isValid("")); // true (empty string is valid)
        System.out.println("\"{\": " + sol.isValid("{"));           // false
        System.out.println("\"]\": " + sol.isValid("]"));           // false
    }
}
