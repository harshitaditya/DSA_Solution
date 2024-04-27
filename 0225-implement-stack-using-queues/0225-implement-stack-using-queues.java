class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    public MyStack() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
        size=0;
        
    }
    
    public void push(int x) {
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.poll());

        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        size++;
        
    }
    
    public int pop() {
        if(size==0){
            return -1;
        }
        int ans=q2.poll();
        size--;
        return ans;
        
    }
    
    public int top() {
        if(size==0){
            return -1;
        }
        return q2.peek();
        
    }
    
    public boolean empty() {
        if(size==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */