class Solution {
    public int singleNumber(int[] nums) {
        // brute force 
        //  for(int i=0;i<nums.length;i++){
        //     int num=nums[i];
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(num==nums[j]){
        //             count++;
        //         }

        //     }
        //     if(count==1){
        //         return num;
        //     }
        // }
        // return 0;


        //Better Approach


        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int value=map.getOrDefault(i,0);
            map.put(i,value+1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;

        
    }
}