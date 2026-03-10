package questions;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // HashMap to store number → index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Find the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {

                // If found, return the indices
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        // Return empty array if no solution is found
        return new int[]{};
    }

    public static void main(String[] args) {

        // Create object of the class
        TwoSum obj = new TwoSum();

        // Input array
        int[] nums = {2, 7, 11, 15};

        // Target value
        int target = 9;

        // Call the twoSum method
        int[] res = obj.twoSum(nums, target);

        // Print result
        System.out.println(Arrays.toString(res));
    }
}