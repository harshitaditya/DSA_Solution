class Solution {
    public boolean isPowerOfThree(int n) {
        //  if(n==1){
        //     return true;

        // }
        // if(n<1){
        //     return false;
        // }
        // while(n>1){
        //     if(n%3!=0){
        //         return false;
        //     }
        //     n=n/3;
        // }
        // return true;
         if(n==1){
            return true;
        }
        
        if(n==0 || n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
        
    }
}