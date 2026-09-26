import java.util.*;

public class MostFreq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int max = 0;
        int value = 0;

        // Find most frequent value
        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                value = arr[i];
            }
        }

        System.out.println(value);
        sc.close();
    }
}
// Sep 26 HashMap practice
