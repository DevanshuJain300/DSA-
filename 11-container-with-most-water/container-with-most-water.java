class Solution {
    public int maxArea(int[] height) {
        int curr=0;
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<height[r]){
                curr= (r-l)*height[l];
                max=Math.max(curr,max);
                l++;
            }
            else{
                curr = (r-l)*height[r];
                max=Math.max(curr,max);
                r--;
            }
            
        }
        return max;
    }
}