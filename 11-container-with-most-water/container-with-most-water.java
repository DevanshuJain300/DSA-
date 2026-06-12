class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int area=0;
        while(l<r){
            int currArea=Math.min(height[l],height[r]) * (r-l);
            area=Math.max(currArea,area);
            if(height[l]<height[r]){
                l++;
            }
            else{r--;}
        }
        return area;
    }
}