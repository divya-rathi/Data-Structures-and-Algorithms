class StackAsLinkedList{
    StackNode root;
    static class StackNode{
        int data;
        StackNode next;

        StackNode(int d){
            data =d;
            next =null;
        }
    }
    public boolean isEmpty(){
        return (root==null);
    }
    public void push(int d){
        StackNode node = new StackNode(d);
        if(root==null){
            root=node;
        }
        else{
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println(d + " pushed to stack");
    }
    public int pop(){
        if(root==null){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        int temp = root.data;
        root = root.next;
        return temp;
    }
    public int peek(){
        if(root==null){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        return root.data;
    }
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    }
}