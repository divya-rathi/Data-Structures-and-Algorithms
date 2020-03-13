class QueueAsLinkedList{
    QNode front,rear;
    class QNode{
        int data;
        QNode next;

        QNode(int d){
            data = d;
            next = null;
        }
    }  
    QueueAsLinkedList(){
        this.front =  this.rear = null;
    }

    void enqueue(int data){
        QNode node = new QNode(data);
        if(this.front == null){
            this.front = this.rear = node;
        }
        else{
            this.rear.next = node;
            this.rear = node;
        }
        System.out.println(data + " equeued!");
    }

    int dequeue(){
        if(this.front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp = front.data;
        front = front.next;
        if(front==null){
            rear = null;
        }
        return temp;
    }


    public static void main(String[] args) {
        QueueAsLinkedList q = new QueueAsLinkedList(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        System.out.println("Queue Front : " + q.front.data); 
        System.out.println("Queue Rear : " + q.rear.data); 
    }
}