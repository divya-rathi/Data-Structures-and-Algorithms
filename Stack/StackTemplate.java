import java.util.*;
/*class StackTemplate{

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        
    }
}*/

class StackTemplate{
    static final int MAX = 50;
    int top;
    int stack[] = new int[MAX];

    StackTemplate(){
        top = -1;
    }

    boolean push(int data){
        if(top >= (MAX-1)){
            System.out.println("Stack Overflow!!");
            return false;
        }
        top += 1;
        stack[top] = data;
        System.out.println(data + " pushed into stack.");
        return true;
    }

    int pop(){
        if (size()==-1){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        int del = stack[top];
        top--;
        return del;
    }

    int peek(){
        if (top==-1){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty(){
        return (top<0);
    }

    int size(){
        return top+1;
    }

    public static void main(String[] args) {
        StackTemplate s = new StackTemplate();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Size: "+ s.size());
        System.out.println("Peek value: "+ s.peek());
        System.out.println("Pop value: "+s.pop());
        System.out.println("Size: "+ s.size());
    }
}
