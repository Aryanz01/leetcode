class Solution {
    public int maxScore(String s) {
        char[] c= s.toCharArray();
        int left =0;
        int right=0;
        int max=0;
        int temp=0;

        for(int i=0; i<c.length; i++){
            if(c[i]== '1'){
                right++;
            }
        }

        for(int j=0; j<c.length-1; j++){
            if(c[j]=='0'){
                left++;
            }else{
                right--;
            }

            temp = left +right;
            max = Math.max(max, temp); 
        }
     
        return max;

    }
}