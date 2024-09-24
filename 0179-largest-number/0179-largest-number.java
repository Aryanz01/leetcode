import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the array using custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare which concatenation is larger
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Reverse order (desc)
            }
        });

        // If the largest number is 0, return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Join the sorted array to form the largest number
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }
}
