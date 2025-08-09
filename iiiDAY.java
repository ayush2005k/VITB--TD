public class iiiDAY {
    public static void main(String[] args) {
        String pan = "A man, a plan, a canal: Panama";
        String lowerpan = pan.toLowerCase();
        System.out.println(lowerpan);
        String cleanlowepan = lowerpan.replaceAll("[^a-zA-Z0-9]",""); // need to watch the video on this 
        System.out.println(cleanlowepan);
        if (cleanlowepan!="") {
            System.out.println("True");
        }else{
            System.out.println("flase");
        }
    }
}

// different methods
 class Solution {
    public boolean isPalindrome(String param_1) {
        String cleanedString = param_1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

