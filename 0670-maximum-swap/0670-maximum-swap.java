// class Solution {

//     public int maximumSwap(int num) {
//         String numStr = Integer.toString(num); // Convert num to string for easy manipulation
//         int n = numStr.length();
//         int maxNum = num; // Track the maximum number found

//         // Try all possible swaps
//         for (int i = 0; i < n; ++i) {
//             for (int j = i + 1; j < n; ++j) {
//                 char[] numeral = numStr.toCharArray(); // Convert string to char array for swapping

//                 // Swap digits at index i and j
//                 char temp = numeral[i];
//                 numeral[i] = numeral[j];
//                 numeral[j] = temp;

//                 int tempNum = Integer.parseInt(new String(numeral)); // Convert the char array back to integer

//                 maxNum = Math.max(maxNum, tempNum); // Update maxNum if the new number is larger
//             }
//         }

//         return maxNum; // Return the largest number after all possible swaps
//     }
// }



class Solution {

    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;
        int[] maxRightIndex = new int[n];

        maxRightIndex[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; --i) {
            maxRightIndex[i] = (numArr[i] > numArr[maxRightIndex[i + 1]])
                ? i
                : maxRightIndex[i + 1];
        }

        for (int i = 0; i < n; ++i) {
            if (numArr[i] < numArr[maxRightIndex[i]]) {
                char temp = numArr[i];
                numArr[i] = numArr[maxRightIndex[i]];
                numArr[maxRightIndex[i]] = temp;
                return Integer.parseInt(new String(numArr));
            }
        }

        return num;
    }
}


