public class ivDAY {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9; 
        for (int i = 0; i < num.length; i++) {
            // Fix: Start the inner loop from 'i + 1' for better efficiency and to avoid the 'if(i < j)' check.
            for (int j = i + 1; j < num.length; j++) { //j=i+j to remove dupcliate we can j=o but then if(i<j)
                int sum = num[i] + num[j];

                if (sum <= target) { // The comparison now works correctly.
                    System.out.println("Pair(" + num[i] + ", " + num[j] + ") sum: " + sum);
                }
            }
        }
    }
}
