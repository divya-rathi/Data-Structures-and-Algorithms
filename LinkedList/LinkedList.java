import java.util.*;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    
    //Insertion

    public static LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(list.head==null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    //Traversal

    public static void print(LinkedList list){
        Node currnode = list.head;
        System.out.println("\nLinkedList: ");
        while(currnode!=null){
            System.out.println(currnode.data + " ");
            currnode = currnode.next;
        }
        System.out.println("\n");

    }

    //Deletion by key
    
    public static LinkedList deleteByKey(LinkedList list, int key){
        Node currnode = list.head;
        Node prev = null;
        // CASE 1: If head node itself holds the key to be deleted 
        if(currnode!=null && currnode.data==key){
            list.head = currnode.next;
            System.out.println(key + " found and deleted ");
            return list;
        }
        // CASE 2: If the key is somewhere other than at head 
        while(currnode!=null && currnode.data!=key){
            prev = currnode;
            currnode =  currnode.next;
        }
        if(currnode!=null){
            prev.next=currnode.next;
            System.out.println(key + " found and deleted ");
        }
        // CASE 3: The key is not present 
        if(currnode==null){
             System.out.println(key + " not found"); 
        }
        return list;
    }

    //Deletion at a position
    
    public static LinkedList deleteAtPosition(LinkedList list, int index){
        Node currnode = list.head;
        //System.out.println(list.head);
        Node prev = null;
        // CASE 1: If index is 0, then head node itself is to be deleted 
        if(index==0 && currnode!=null){
            currnode = currnode.next;
            System.out.println(index + " position element deleted"); 
            return list;
        }
        
        // CASE 2: If the index is greater than 0 but less than the size of LinkedList 
        int counter =0;
        while(currnode!=null){
            if(counter==index){
                prev.next = currnode.next;
                System.out.println(index + " position element deleted");
                break;
            }
            else{
                prev = currnode;
                currnode=currnode.next;
                counter++;
            }
        }
        
        // CASE 3: The index is greater than the size of the LinkedList 
        if(currnode==null){
            System.out.println(currnode);
            System.out.println(index + " position element not found");
        }
        return list;
  
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6);

        print(list);

        deleteByKey(list, 4); 
        print(list);
        
        deleteAtPosition(list, 4); 
        print(list);
    }
}