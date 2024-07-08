class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i =n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i]=0;      //for cases ending in 29, 49.79...
        }

        //for all 9s...

        int[] result = new int[n+1];

        result[0]= 1;
        
        
        return result;
    }
}




// doesn't work for all 9s or multiple 9s or terms like 29, 39 cases 
// if(digits[n-1]==9){
//             int[] result = new int[n+1];
        
//         for(int i=0 ; i<n ; i++){
//                 result[i]= digits[i];
//             }
            
//             result[n-1]=1;
//             result[n]=0;
            
//             return result;
//         }
        
//         else{
//             digits[n-1]=digits[n-1]+1;
//             return digits;
//         }