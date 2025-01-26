// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n1= nums1.length;
//         int n2= nums2.length;
//         Stack<Integer> st = new Stack<>();
//         int ans[]= new int[n];
//         int j=0;

//         for(int i=0; i<n1 ; i++){
//             st.push(nums1[i]);
//             k=i;
//             while(nums1[k] != nums2[j]){
//                 k++;
//                 j++;
//             }

//             if()


//         }
//     }
// }



class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }
        
        return result;
    }
}



