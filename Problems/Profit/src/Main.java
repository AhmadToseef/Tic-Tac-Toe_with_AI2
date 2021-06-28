import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double mony = scanner.nextDouble(); // K
        double percentage = scanner.nextDouble(); // P
        double finalMony = scanner.nextDouble(); // M
        int countDays = 0; // Days

        while (mony < finalMony) {
            mony += getPercentage(mony, percentage);
            ++countDays;
        }

        System.out.println(countDays);
    }

    public static double getPercentage(double mony, double percentage) {
        return mony * percentage / 100;
    }
}