import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(nums);

        System.out.println("Subsets of the array are:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsetsHelper(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsetsHelper(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset)); // Add a copy of the current subset

        for (int i = index; i < nums.length; i++) {
            currentSubset.add(nums[i]); // Include the current element in the subset
            generateSubsetsHelper(nums, i + 1, currentSubset, subsets); // Recursively generate subsets
            currentSubset.remove(currentSubset.size() - 1); // Exclude the current element for the next iteration
        }
    }
}
