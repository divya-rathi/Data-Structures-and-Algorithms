import java.util.*;
class LinkedListAlternate{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void merge(LinkedListAlternate list2){
        Node list1_curr = head;
        Node list2_curr = list2.head;
        Node list1_next, list2_next;

        while(list1_curr!=null && list2_curr!=null){
            list1_next = list1_curr.next;
            list2_next = list2_curr.next;

            list2_curr.next = list1_next;
            list1_curr.next = list2_curr;

            list1_curr = list1_next;
            list2_curr = list2_next;

        }
        list2.head = list2_curr;
    }

    void printList() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        } 
        System.out.println(); 
    } 

    public static void main(String[] args) {
        LinkedListAlternate llist1 = new LinkedListAlternate(); 
        LinkedListAlternate llist2 = new LinkedListAlternate(); 
        llist1.push(3); 
        llist1.push(2); 
        llist1.push(1); 
  
        System.out.println("First Linked List:"); 
        llist1.printList(); 
  
        llist2.push(8); 
        llist2.push(7); 
        llist2.push(6); 
        llist2.push(5); 
        llist2.push(4); 
  
        System.out.println("Second Linked List:"); 
        llist2.printList(); 
  
        llist1.merge(llist2); 
  
        System.out.println("Modified first linked list:"); 
        llist1.printList(); 
  
        System.out.println("Modified second linked list:"); 
        llist2.printList(); 
    }
}