// import java.util.*;

// class Solution {
//     public int[] sortArray(int[] nums) {
//         sort(nums, nums.length);
//         return nums;
//     }

//     public void sort(int[] nums, int n) {
//         if (n <= 1) {
//             return;
//         }

//         int temp = nums[n - 1];

//         sort(nums, n - 1);

//         insert(nums, n - 1, temp);
//     }

//     public void insert(int[] nums, int n, int temp) {
//         if (n == 0 || nums[n - 1] <= temp) {
//             nums[n] = temp;
//             return;
//         }

//         int last = nums[n - 1];
//         nums[n] = last;

//         insert(nums, n - 1, temp);
//     }
// }


class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;     // pointer for left subarray
        int j = mid + 1;  // pointer for right subarray
        int k = 0;        // pointer for temp array

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements if any
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        // Copy sorted temp array back to nums
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }
}
