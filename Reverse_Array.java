import java.util.*;

public class Reverse_Array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elemnts of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i] + " ");
        }

    }

}
