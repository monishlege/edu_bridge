package hfihgih;

public class demo {
    public static void main(String... args) {
        try {
            System.out.println("Start");
            int c = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero caught!");
        }
        System.out.println("Stop");
    }
}

package hfihgih;

import java.util.Scanner;

public class demo {
    public static void main(String... args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Start");
            System.out.print("Type 1 (for Array) or 0 (for Arithmetic Operations): ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                int[] numbers = {10, 20, 30};
                System.out.println(numbers[5]);
            } else if (choice == 0) {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println("Result: " + c);
            } else {
                System.out.println("Invalid input!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        System.out.println("Stop");
    }
}
