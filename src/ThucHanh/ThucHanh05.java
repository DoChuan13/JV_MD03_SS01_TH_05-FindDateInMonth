package ThucHanh;

import java.util.Scanner;

public class ThucHanh05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.printf("The month %d has 28 or 29 days",month);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("The month %d has 31 days",month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("The month %d has 30 days", month);
                break;
            default:
                System.out.println("This month doesn't exist");
        }
    }
}
