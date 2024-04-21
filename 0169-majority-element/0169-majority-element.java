class Solution {
    public int majorityElement(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
           int count1=0;
           int count2=0;
            for( j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count1++;

                }
                else{
                    count2++;
                }
            }
            if(count1>count2){
             return nums[i];
            }
            
        }
    
        
            return 0;
        
    }
}