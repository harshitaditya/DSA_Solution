class Solution {
    public int findMaxK(int[] nums) {
       Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==0){
                return nums[end];
            }
            else if(nums[start]+nums[end]<0){
                start++;
            }
            else{
                end--;
            }
        }
        
        return -1;
        
    }
}