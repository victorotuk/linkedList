
package linkedlist;

import java.util.LinkedList;

public class LinkedListUs {

    Node head;
    int count;
    
    public LinkedListUs(){
        this.head = null;
        this.count = 0;
    }
    
    public LinkedListUs(Node newHead){
        this.head = newHead;
        this.count = 1;
    }
    //add
    public void add(int newData){
        
        if (head == null){
            head = new Node(newData);
        }else{
            Node curr= head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node(newData);
        }
        /*Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);*/
        count++;
    }
    
    //get
    
    public int get(int index){
        if (index <=0)
        return -1;
        
        Node current = head;
        for(int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }
    
    //size
    public int size(){
        return count;
    }
    
    //isempty
    public boolean isEmpty(){
        return head == null;
    }
    
    //remove
    
    public void remove(){
        Node current = head;
        while (current.next.next != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    
    public static void main(String[] args) {
        
        LinkedList<String> linky = new LinkedList<String>();
        linky.add("mekus");
        System.out.println(linky);
        linky.add("smokey");
        System.out.println(linky);
    }
    
}
