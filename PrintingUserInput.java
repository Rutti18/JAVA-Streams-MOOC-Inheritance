import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputList = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) { //end program when user does not provide any text input
                userInputList.stream()
                        .forEach(word -> System.out.println(word));
                break;
            }
            userInputList.add(userInput); // add the input to the list
        }

    }
}