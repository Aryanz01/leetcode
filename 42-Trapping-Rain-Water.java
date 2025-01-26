/*
class Solution {
    public int trap(int[] height) {
        int maxcap=0;
        int netcap=0;

        for(int i=0 ; i<height.length; i++)
        {
            if(height[0]==0){
                i++;
            }else{         //find next element greater than 1st
                for(int j=i+1; j<height.length ;j++){
                    if(height[j]>height[i]){
                        maxcap= height[i]*(j-(i+1));

                    }


                }

            }
        }
    }
}
*/



class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int water = 0;

        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    water += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    water += maxRight - height[right];
                }
                right--;
            }
        }

        return water;
    }
}
