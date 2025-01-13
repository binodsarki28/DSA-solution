package Array;

public class TwoPointerSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 10, 11, 15};
        int left = 0; // Start with the first index
        int right = a.length - 1; // Start with the last index
        int target = 15;

        while (left < right) {
            int curr_sum = a[left] + a[right];

            if (curr_sum == target) {
                System.out.println("Indices: " + left + " " + right);
                System.out.println("Values: " + a[left] + " " + a[right]);
                break; // Break if you want only one solution
            } else if (curr_sum < target) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }
    }
}
