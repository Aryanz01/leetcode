class Solution {
    public int maxArea(int[] height) {
        int left=0; 
        int right = height.length -1;

        int maxarr=0;

        while(left<right){
            int currarr= Math.min(height[left], height[right]) * (right -left);
            maxarr = Math.max(maxarr, currarr);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxarr;
        
    }
}