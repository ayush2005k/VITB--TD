import java.util.Scanner;

public class xDAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Get the score of the k-th participant
        int kThScore = scores[k - 1];
        int advancingParticipants = 0;

        // Count participants who advance
        for (int score : scores) {
            if (score >= kThScore && score > 0) {
                advancingParticipants++;
            }
        }

        System.out.println(advancingParticipants);

        scanner.close();
    }
}