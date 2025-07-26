public class ID {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ID solution = new ID();
        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println("Input: [12, 345, 2, 6, 7896]");
        System.out.println("Output: " + solution.findNumbers(nums1)); // Expected output: 2

        int[] nums2 = {555, 901, 482, 1771};
        System.out.println("\nInput: [555, 901, 482, 1771]");
        System.out.println("Output: " + solution.findNumbers(nums2)); // Expected output: 1
    }
}
