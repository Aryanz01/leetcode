class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            result.append(sum % 2); // Append the remainder (0 or 1)
            carry = sum / 2; // Calculate the carry
        }
        
        if (carry != 0) {
            result.append(carry); // Append the final carry if it's not zero
        }
        
        return result.reverse().toString(); // Reverse the result to get the final binary string
    }
}
