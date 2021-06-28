import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextByte();
        int up = scanner.nextByte();
        int down = scanner.nextByte();

        int tempUp = 0;
        int countDays = 0;

        while (true) {
            tempUp += up;
            ++countDays;
            if (tempUp >= height) {
                break;
            }
            tempUp -= down;
        }
        System.out.println(countDays);
    }
}