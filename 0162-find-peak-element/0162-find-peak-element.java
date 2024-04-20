class Solution {
    public int findPeakElement(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
           int count=0;
            for( j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    count++;

                }
            }
            if(count==0){
             return i;
            }
        }
    
        
            return -1;
        
    }
}