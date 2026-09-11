package college;
import java.util.Scanner;
public class insert {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Original array size
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Input the element to insert
            System.out.print("Enter the element to insert: ");
            int element = scanner.nextInt();

            // Input the position to insert at
            System.out.print("Enter the position (0 to " + n + "): ");
            int position = scanner.nextInt();

            if (position < 0 || position > n) {
                System.out.println("Invalid position!");
                return;
            }

            // New array with one extra size
            int[] newArray = new int[n + 1];

            // Insert elements into the new array
            for (int i = 0; i < position; i++) {
                newArray[i] = arr[i];
            }

            newArray[position] = element;

            for (int i = position; i < n; i++) {
                newArray[i + 1] = arr[i];
            }

            // Print the new array
            System.out.println("Array after insertion:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }

        }
}
