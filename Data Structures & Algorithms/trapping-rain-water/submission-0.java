class Solution {
    public int trap(int[] height) {
        int total = 0;
        int[] prefixmax = prefixMax(height);
        int[] suffixMax = suffixMax(height);

        for(int i=0; i<height.length; i++)
        {
          int leftMax = prefixmax[i];
           int rightMax = suffixMax[i];

           if(height[i] < leftMax && height[i] < rightMax)
           {
             total = total + Math.min(leftMax,rightMax) - height[i];
           }
        } 
        return total;       
    }

    public int[] prefixMax(int[] arr)
    {
        int[] prefixMaxArr = new int[arr.length];
        prefixMaxArr[0] = arr[0];
        for(int i=1; i<arr.length;i++)
        {
           prefixMaxArr[i] = Math.max(arr[i],prefixMaxArr[i-1]);
        }

        return prefixMaxArr;
    }

     public int[] suffixMax(int[] arr)
    {
        int[] suffixMaxArr = new int[arr.length];
        suffixMaxArr[arr.length -1] = arr[arr.length -1];
        for(int i=arr.length-2; i > 0;i--)
        {
           suffixMaxArr[i] = Math.max(arr[i],suffixMaxArr[i+1]);
        }
        return suffixMaxArr;
    }
}