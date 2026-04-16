class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int maxNoDeletion=arr[0];
        int maxOneDeletion=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevNoDeletion=maxNoDeletion;   //storing maxNoDeletion in a variable
            
            maxNoDeletion=Math.max(maxNoDeletion+arr[i],arr[i]);

            maxOneDeletion=Math.max(maxOneDeletion+arr[i],prevNoDeletion);

            result=Math.max(result, Math.max(maxNoDeletion,maxOneDeletion));
        }
        return result;

    }
}