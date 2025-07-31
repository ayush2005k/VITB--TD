import java.util.ArrayList;
import java.util.List;

class iiD {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divBy3 = (i % 3 == 0);
            boolean divBy5 = (i % 5 == 0);

            if (divBy3 && divBy5) {
                answer.add("FizzBuzz");
            } else if (divBy3) {
                answer.add("Fizz");
            } else if (divBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        iiD solution = new iiD();
        int n = 15;
        System.out.println("Output for n = " + n + ": " + solution.fizzBuzz(n));
    }
}
