import java.util.ArrayList;
import java.util.Scanner;

// The class name is now "Main"
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by spaces (e.g., 10 20 30):");
        
        // 1. Read the entire line of input
        String inputLine = scanner.nextLine();
        String[] numberStrings = inputLine.split(" ");
        
        // Create a list to hold Integer objects
        ArrayList<Integer> integerList = new ArrayList<>();
        
        System.out.println("\n--- Processing Inputs ---");
        for (String str : numberStrings) {
            try {
                // 2. Parse string to a primitive int
                int primitiveInt = Integer.parseInt(str.trim());
                
                // 3. Autoboxing: primitive int is automatically converted to an Integer object
                integerList.add(primitiveInt); 
                System.out.println("Parsed '" + str + "' to int, then autoboxed to Integer object.");
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid input: '" + str + "'");
            }
        }
        
        // Calculate the sum
        int totalSum = 0;
        System.out.println("\n--- Calculating Sum ---");
        for (Integer number : integerList) {
            // 4. Unboxing: The Integer object 'number' is automatically converted
            //    to a primitive int before being added to totalSum.
            totalSum += number;
            System.out.println("Unboxed Integer(" + number + ") to int and added to sum.");
        }
        
        System.out.println("\n========================");
        System.out.println("The final sum is: " + totalSum);
        System.out.println("========================");
        
        scanner.close();
    }
}