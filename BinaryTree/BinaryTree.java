class Node{
    int value;
    Node left;
    Node right;

    Node(int data){
        value=data;
        left=right=null;
    }
    public void setLeft(Node BTnode){
        left = BTnode;
    }
    public void setRight(Node BTnode){
        right = BTnode;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void setData(int d){
        value = d;
    }
    public int getData(){
        return value;
    }     
}
class BinaryTree{
    Node root;  
    public BinaryTree(){
        root = null;
    }
    public boolean isEmpty(){
        return (root==null);
    }
    public void insert(int data){
         root = insert(root, data);
    }
    public Node insert(Node node, int d){
        if(node==null){
            node = new Node(d);
        }
        else{
            if (node.getRight()==null){
                node.right = insert(node.right, d);
            }
            else{
                node.left = insert(node.left, d);
            }
        }
        return node;
    }
    public int countNodes(){
         return countNodes(root);
    }
    private int countNodes(Node r){
         if (r == null)
             return 0;
         else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    public boolean search(int val){
         return search(root, val);
    }
    private boolean search(Node r, int val){
         if (r.getData() == val)
             return true;
         if (r.getLeft() != null)
             if (search(r.getLeft(), val))
                 return true;
         if (r.getRight() != null)
             if (search(r.getRight(), val))
                 return true;
         return false;         
    }
    public void inorder(){
         inorder(root);
    }
    private void inorder(Node r){
        if (r != null){
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
        }
    }
    
    public static void main(String[] args) {
        
    }
}