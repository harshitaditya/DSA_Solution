class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while(i<chalk.length){
            if(k<chalk[i]){
                return i;
            }
            k=k-chalk[i];
            
            if(i==chalk.length-1){
                i=0;
                continue;
               
              
            }
            i++;
            
        }

        return 0;
        
    }
}