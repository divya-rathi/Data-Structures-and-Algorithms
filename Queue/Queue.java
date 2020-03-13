class Queue{
    int arr[];
    int front, rear;
    int capacity;
    int count;

    Queue(int size){
        arr = new int[size];
        capacity = size;
        front = rear = -1;
        count = 0;
    }
    boolean isEmpty(){
        return (count==0);
    }
    void enqueue(int data){
        if(isEmpty()){
            front=rear=0;
        }
        else if(count==capacity){
            System.out.println("Queue is full!!");
            return ;
        }
        else{
            rear += 1;
        }
        arr[rear]=data;
        count++;
        System.out.println(data+" is added to the queue.");
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int temp = arr[rear];
        rear -= 1;
        count -= 1;
        return temp;
    }
    int size(){
        return count;
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Size: " + q.size());
        System.out.println(q.dequeue());
        System.out.println("Size: " + q.size());
        q.enqueue(11);
        q.enqueue(21);
        q.enqueue(31);
        q.enqueue(32);
    }
}