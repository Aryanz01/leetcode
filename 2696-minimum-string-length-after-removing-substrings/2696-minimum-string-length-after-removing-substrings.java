class Solution {
    public int minLength(String s) {
        StringBuilder sb =new StringBuilder(s);
       for(int i=0 ; i< sb.length()-1 ; ){
           if(sb.charAt(i)=='A' && sb.charAt(i+1)=='B' || sb.charAt(i)=='C' && sb.charAt(i+1)=='D'){
               // sb.deleteCharAt(i);
               // sb.deleteCharAt(i+2);
               
               sb.delete(i, i + 2);
              if (i > 0) {
                    i--; // Move back one index to recheck
                }
              
           }
           else {
             
                i++;
            }
       } 
        
        
        return sb.length();
        
        
    }
}