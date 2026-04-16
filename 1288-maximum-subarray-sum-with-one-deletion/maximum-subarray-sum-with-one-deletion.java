class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int maxNoDeletion=arr[0];           //max without any deletion
        int maxOneDeletion=arr[0];          //max with  one deletion
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevNoDeletion=maxNoDeletion;   //storing maxNoDeletion in a variable
            
            maxNoDeletion=Math.max(maxNoDeletion+arr[i],arr[i]);

            maxOneDeletion=Math.max(maxOneDeletion+arr[i],prevNoDeletion);  //arr[i] can not be included in one deletion because it contains only single element without any deletion

            result=Math.max(result, Math.max(maxNoDeletion,maxOneDeletion));
        }
        return result;

    }
}