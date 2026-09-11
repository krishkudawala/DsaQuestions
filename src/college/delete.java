package college;
import java.util.Scanner;
public class delete {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Original array size
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] originalArray = new int[n];

            // Input array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                originalArray[i] = scanner.nextInt();
            }

            // Input the position to delete
            System.out.print("Enter the position to delete (0 to " + (n - 1) + "): ");
            int position = scanner.nextInt();

            if (position < 0 || position >= n) {
                System.out.println("Invalid position!");
                return;
            }

            // New array with one less size
            int[] newArray = new int[n - 1];

            // Copy elements except the one at the delete position
            for (int i = 0, j = 0; i < n; i++) {
                if (i == position) {
                    continue; // skip the element at delete position
                }
                newArray[j++] = originalArray[i];
            }

            // Print the new array
            System.out.println("Array after deletion:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }

