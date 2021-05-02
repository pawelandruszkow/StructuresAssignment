import java.util.*;


public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getValidNumber("Choose number for command> ", List.of(1, 2, 3, 9, 10));
    }

    Map<Integer, String> choices = Map.of(
            1, "add",
            2, "find",
            3, "remove",
            4, "display"
    );

    static int getSelection() {

        Integer validNumber = getValidNumber("Choose number for command> ", List.of(1, 2, 3, 9, 10));
return 0;
    }

    static  int getValidNumber(String promptMessage, List<Integer> validNumbers) {
        Integer inputtedNumber = null;
        while (inputtedNumber == null) {
            try {
                System.out.print(promptMessage + " ");
                inputtedNumber = input.nextInt();
                if(! validNumbers.contains(inputtedNumber)){
                    System.err.println("Please enter a valid number");
                    inputtedNumber = null;
                }
            } catch (InputMismatchException e) {
                System.err.println("Input not a number! Please try again.");
            }
        }
        return inputtedNumber;
    }
}
