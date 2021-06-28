import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        Random random = new Random(k);
        int i = 0;
        int count = 0;

        while (true) {
            while (i++ < n) {
                double rand = random.nextGaussian();
                if (rand <= m) {
                    count++;
                } else {
                    break;
                }
            }
            random.setSeed(++k);
            i = 0;
            if (count == n) {
                System.out.println(k - 1);
                break;
            }
            count = 0;
        }
    }
}