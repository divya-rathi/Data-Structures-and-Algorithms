import java.util.LinkedList;
import java.util.Queue;

class QueueInterface{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 5; i++){
            q.add(i);
        } 
        System.out.println("Elements of queue-"+q);
        System.out.println("Head of queue-"+ q.peek());
        System.out.println("Remove head of queue-"+ q.remove());
        System.out.println("Elements of queue-"+q);
        System.out.println("Poll of queue-"+ q.poll()); 
        System.out.println("Elements of queue-"+q);
    }
}