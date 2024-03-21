import java.util.*;

public class Binary_Search {
    public static int bsearch(int arr[], int target) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        System.out.println("Enter the target that you want to find: ");
        int target = s.nextInt();
        int position = bsearch(arr, target);
        if (position == -1)
            System.out.println("Elements not presnt in array.");
        else
            System.out.println("The elemnts that you want to find is at position:" + position);

    }

}
