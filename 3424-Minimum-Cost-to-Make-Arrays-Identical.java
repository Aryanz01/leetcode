// import java.util.Arrays;

// class Solution {
//     public long minCost(int[] arr, int[] brr, long k) {
//         // Step 1: Sort both arrays
//         Arrays.sort(arr);
//         Arrays.sort(brr);

//         // Step 2: Calculate the adjustment cost
//         long adjustmentCost = 0;
//         for (int i = 0; i < arr.length; i++) {
//             adjustmentCost += Math.abs(arr[i] - brr[i]);
//         }

//         // Step 3: Rearranging cost (no splits required)
//         long rearrangingCost = 0;  // No splits by default
        
//         // Step 4: Return the total cost
//         return adjustmentCost + rearrangingCost;
//     }
// }
// import java.util.Arrays;

// class Solution {
//     public long minCost(int[] arr, int[] brr, long k) {
//         // Step 1: Calculate Cost1 (absolute differences without rearranging)
//         long cost1 = 0;
//         for (int i = 0; i < arr.length; i++) {
//             cost1 += Math.abs(arr[i] - brr[i]);
//         }

//         // Step 2: Sort both arrays for optimal rearrangement
//         Arrays.sort(arr);
//         Arrays.sort(brr);

//         // Step 3: Calculate Cost2 (split cost + absolute differences)
//         long cost2 = k; // Initial split cost
//         for (int i = 0; i < arr.length; i++) {
//             cost2 += Math.abs(arr[i] - brr[i]);
//         }

//         // Step 4: Return the minimum of both costs
//         return Math.min(cost1, cost2);
//     }
// }



import java.util.Arrays;

class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long cost1=0;
        for(int i=0 ;  i<arr.length ; i++){
            cost1= cost1+ Math.abs(arr[i]-brr[i]);
        }

     
         Arrays.sort(arr);
         Arrays.sort(brr);

        long cost2=k;
        for(int i=0; i<arr.length; i++){
            cost2=cost2 + Math.abs(arr[i] -brr[i]);
        }

        return Math.min(cost1, cost2);


    }
    
}
