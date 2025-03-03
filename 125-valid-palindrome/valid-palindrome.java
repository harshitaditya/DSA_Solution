import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String string=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n=string.length();
        for(int i=0;i<n/2;i++){
            if(string.charAt(i)!=string.charAt(n-i-1)){
                return false;
            }

        }
        return true;

        
    }
}