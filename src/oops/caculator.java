package oops;
import java.util.Scanner;
public class caculator {


    class Calculator {

        // Add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Add two doubles
        public double add(double a, double b) {
            return a + b;
        }

        // Add a variable number of integers
        public int add(int... numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//            Calculator calc = new Calculator();
//
//            System.out.println("Calculator - Method Overloading Example");
//
//            System.out.println("Choose an option:");
//            System.out.println("1. Add two integers");
//            System.out.println("2. Add three integers");
//            System.out.println("3. Add two doubles");
//            System.out.println("4. Add multiple integers (varargs)");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter first integer: ");
//                    int a1 = scanner.nextInt();
//                    System.out.print("Enter second integer: ");
//                    int b1 = scanner.nextInt();
//                    System.out.println("Result: " + calc.add(a1, b1));
//                    break;
//
//                case 2:
//                    System.out.print("Enter first integer: ");
//                    int a2 = scanner.nextInt();
//                    System.out.print("Enter second integer: ");
//                    int b2 = scanner.nextInt();
//                    System.out.print("Enter third integer: ");
//                    int c2 = scanner.nextInt();
//                    System.out.println("Result: " + calc.add(a2, b2, c2));
//                    break;
//
//                case 3:
//                    System.out.print("Enter first double: ");
//                    double d1 = scanner.nextDouble();
//                    System.out.print("Enter second double: ");
//                    double d2 = scanner.nextDouble();
//                    System.out.println("Result: " + calc.add(d1, d2));
//                    break;
//
//                case 4:
//                    System.out.print("How many numbers do you want to add? ");
//                    int count = scanner.nextInt();
//                    int[] numbers = new int[count];
//                    for (int i = 0; i < count; i++) {
//                        System.out.print("Enter number " + (i + 1) + ": ");
//                        numbers[i] = scanner.nextInt();
//                    }
//                    System.out.println("Result: " + calc.add(numbers));
//                    break;
//
//                default:
//                    System.out.println("Invalid choice.");
//            }
//
//            scanner.close();
        }
    }
}
