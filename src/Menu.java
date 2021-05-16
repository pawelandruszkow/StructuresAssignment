import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Please enter one of the following options
                    Press 1 to add new Product
                    Press 2 to find existing product
                    Press 3 to remove a product
                    Press 4 to display all product details
                    """);
            int selection = getSelection();

            if (selection == 1)
                ProductList.addProduct();
            if (selection == 4)
                ProductList.displayProducts();
        }
    }

    Map<Integer, String> choices = Map.of(
            1, "add",
            2, "find",
            3, "remove",
            4, "display"
    );

    static int getSelection() {

        Integer validNumber = getValidNumber(">> ", List.of(1, 2, 3, 4));
        return validNumber;
    }

    public static int getValidNumber(String promptMessage, List<Integer> validNumbers) {
        Integer inputtedNumber = null;
        while (inputtedNumber == null) {
            try {
                System.out.print(promptMessage + " ");
                inputtedNumber = input.nextInt();
                if (validNumbers != null && !validNumbers.contains(inputtedNumber)) {
                    System.err.println("Please enter a valid number");
                    inputtedNumber = null;
                }
            } catch (InputMismatchException e) {
                System.err.println("Input not a number! Please try again.");
                inputtedNumber = null;
            }
        }
        return inputtedNumber;
    }

    public static String getString(String promptMessage) {
        String inputtedString = null;
        while (inputtedString == null) {
            System.out.print(promptMessage + " ");
            inputtedString = new Scanner(System.in).nextLine();
            if (inputtedString.isBlank()) {
                System.err.println("Please enter something");
                inputtedString = null;
            }
        }
        return inputtedString;
    }
}
