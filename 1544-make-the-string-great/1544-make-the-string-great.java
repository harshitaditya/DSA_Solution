//using stack
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - ch)==32)
                stack.pop();
            else
                stack.add(ch);
            
        }
        StringBuffer sb=new StringBuffer();
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
        
    }
}