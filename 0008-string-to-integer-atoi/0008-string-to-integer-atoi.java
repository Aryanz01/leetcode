// class Solution {
//     public int myAtoi(String s) {
//         int i = 0, n = s.length();
//         int sign = 1;  
//         int result = 0;

      
//         while (i < n && s.charAt(i) == ' ') {
//             i++;
//         }

    
//         if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
//             sign = (s.charAt(i) == '-') ? -1 : 1;
//             i++;
//         }

      
//         while (i < n && Character.isDigit(s.charAt(i))) {
//             int digit = s.charAt(i) - '0';

          
//             if (result > (Integer.MAX_VALUE - digit) / 10) {
//                 return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//             }

//             result = result * 10 + digit;
//             i++;
//         }

     
//         return result * sign;
//     }
//}


// class Solution {
//     public int myAtoi(String s) {
//         if(s==null) return 0;
        
//         s=s.trim();  //remove white space
        
//         if(s.length()==0) return 0;
        
//         int sign = +1;
//         long ans = 0;
        
//         int MAX = Integer.MAX_VALUE;
//         int MIN= Integer.MIN_VALUE;
        
//         //sign
//         if(s.charAt(0) == '-') sign =-1;
        
//         int i = (s.charAt(0) == '-' || s.charAt(0)== '+') ? 1 :0 ;
        
//         while(i< s.length()){
            
//             if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))) break;
            
//             ans = ans*10 + (s.charAt(i) -'0');
            
//             if(sign==-1 && -1*ans < MIN) return MIN;
//             if(sign==+1 && ans>MAX) return MAX;
            
//             i++;
            
            
//         }
        
//         return (int)(sign*ans);
        
//     }
// }


class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        // Step 1: Remove leading whitespace
        s = s.trim();
        if (s.isEmpty()) return 0;

        // Step 2: Determine the sign and set the starting index
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        } else if (s.charAt(0) == '+') {
            i = 1;
        }

        // Start recursive helper function
        return myAtoiHelper(s, i, 0, sign);
    }

    private int myAtoiHelper(String s, int i, long ans, int sign) {
        // Base case: Stop if we reach the end of the string or a non-digit character
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * ans);
        }
        
        // Add the current digit to the answer
        ans = ans * 10 + (s.charAt(i) - '0');

        // Check for overflow beyond 32-bit integer limits
        if (sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign == -1 && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        // Recursive call for the next character
        return myAtoiHelper(s, i + 1, ans, sign);
    }
}






















