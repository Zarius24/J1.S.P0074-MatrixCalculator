
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public int getchoice(int min, int max) {
        int choice;
        while (true) {
            System.out.print("Your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.err.println("Please enter number in range [" + min + ", " + max + "]");
            }
        }
    }

    public int checkInputMatrix(String matrix, int i, int j) {
        int n;
        while (true) {
            System.out.print("Enter " + matrix + "[" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Matrix value must be a digit");
            }
        }
    }

    public int checkInputRowAndColumn(String msg) {
        int n;
        while (true) {
            System.out.print(msg);
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Row or column of Matrix must be a digit greater than 0");
            }
        }
    }
}
