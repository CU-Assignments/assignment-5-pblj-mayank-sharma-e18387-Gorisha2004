import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Step 2: Read a list of numbers from the user as a string
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        // Step 3: Convert the input into Integer objects using autoboxing
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token)); // Autoboxing
        }
        
        // Step 4: Compute the sum of the integers using unboxing
        int sum = 0;
        for (Integer number : numbers) {
            sum += number; // Unboxing
        }
        
        // Step 5: Display the result
        System.out.println("Sum of numbers: " + sum);
    }
}
