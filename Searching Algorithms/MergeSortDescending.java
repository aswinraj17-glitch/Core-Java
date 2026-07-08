import java.util.Arrays;

public class MergeSortDescending {

    // Merge Sort Function
    public static void mergeSort(int[] arr, int left, int right) {

        // Base case: If only one element, stop recursion.
        if (left >= right)
            return;

        // Find middle index
        int mid = left + (right - left) / 2;

        // Example:
        // arr = [8,3,5,4]
        // left = 0
        // right = 3
        // mid = 1

        // Divide left half
        mergeSort(arr, left, mid);

        // Divide right half
        mergeSort(arr, mid + 1, right);

        // Merge both sorted halves
        merge(arr, left, mid, right);
    }

    // Merge Function
    public static void merge(int[] arr, int left, int mid, int right) {

        // Temporary array
        int[] temp = new int[right - left + 1];

        // Pointer for left half
        int i = left;

        // Pointer for right half
        int j = mid + 1;

        // Pointer for temp array
        int k = 0;

        /*
         Example

         Left Half  : [8,3]
                       i

         Right Half : [5,4]
                       j

         temp = [ ]
                 k
        */

        while (i <= mid && j <= right) {

            // Descending Order
            // Choose larger element

            if (arr[i] >= arr[j]) {

                // Example:
                // 8 >= 5
                // Copy 8

                temp[k++] = arr[i++];

                /*
                temp = [8]

                i moves to 3
                j still at 5
                */

            } else {

                // Example:
                // 3 < 5
                // Copy 5

                temp[k++] = arr[j++];

                /*
                temp = [8,5]

                j moves to 4
                */
            }
        }

        // Copy remaining left elements
        while (i <= mid) {

            temp[k++] = arr[i++];

            /*
            Example

            temp = [8,5,4]

            Left still has 3

            temp = [8,5,4,3]
            */
        }

        // Copy remaining right elements
        while (j <= right) {

            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array

        for (int x = 0; x < temp.length; x++) {

            arr[left + x] = temp[x];

            /*
            temp = [8,5,4,3]

            Original array becomes

            [8,5,4,3]
            */
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 4};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Descending Merge Sort:");
        System.out.println(Arrays.toString(arr));
    }
}