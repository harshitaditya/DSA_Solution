class Solution {
    public String reversePrefix(String word, char ch) {
       String prefix=word.substring(0,word.indexOf(ch)+1);
       String suffix=word.substring(word.indexOf(ch)+1,word.length());
       StringBuilder ans=new StringBuilder(prefix);
       ans.reverse();
       ans.append(suffix);
        return ans.toString();
    }
}