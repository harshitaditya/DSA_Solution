import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int arr1[]=new int[256];
          int arr2[]=new int[256];
          int i=0;
         for(i=0;i<s.length();i++){
             if(arr1[s.charAt(i)]==0 && arr2[t.charAt(i)]==0){
            arr1[s.charAt(i)]=t.charAt(i);
            arr2[t.charAt(i)]=s.charAt(i);
             }

         
          if( arr1[s.charAt(i)]!=t.charAt(i)&&arr2[t.charAt(i)]!=s.charAt(i)){
            return false;
          }
         }
         return true;
        
    }
}