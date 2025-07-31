import java.util.Scanner;

public class viiDAY {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("weight of watermealon is :");
        int weight = myobj.nextInt();
        System.out.println("weight is :" + weight);
        if (weight>=0) {    
        }else{
            System.out.println("give +ve input");
        }
        if (weight>2 && weight % 2 == 0) {
            System.out.println("YES, the watermelon can be divided as requested.");
        }else{
            System.out.println("NO, the watermelon cannot be divided as requested.");
        }
    }
}
