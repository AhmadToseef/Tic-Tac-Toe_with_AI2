import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Random random;

        int seed = 0;
        int max = Integer.MIN_VALUE;
        int rand;
        int minOfMax = Integer.MAX_VALUE;

        while (a <= b) {
            random = new Random(a);
            for (int j = 0; j < n; j++) {
                rand = random.nextInt(k);
                max = Math.max(rand, max);
            }

            if (minOfMax > max) {
                minOfMax = max;
                seed = a;
            }
            max = Integer.MIN_VALUE;
            ++a;
        }

        System.out.println(seed);
        System.out.println(minOfMax);

    }
}