
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) { //type end to stop the user input
                double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
                
                System.out.println("average of numbers is:" + average);
                break;
            }
            
            inputs.add(row);
        }

    }
}
