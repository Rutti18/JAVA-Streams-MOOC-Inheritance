import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) { // to end the program
                System.out.println("Print the average of the negative number or the positive number? (n/p)");
                String userInput = scanner.nextLine();
                
                if(userInput.isEmpty()){
                    continue;
                }
                if (userInput.toLowerCase().equals("n")) {
                    double averageOfNegatives = inputs.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i < 0)
                            .average() //collections method to get average
                            .getAsDouble();

                    System.out.println("Average of the negative numbers: " + averageOfNegatives);
                } else if (userInput.toLowerCase().equals("p")) {
                    double averageOfPositives = inputs.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i >= 0)
                            .average() //collections method to get average
                            .getAsDouble();

                    System.out.println("Average of the posiive numbers: " + averageOfPositives);
                }

                break;
            }

            inputs.add(row);
        }

    }
}