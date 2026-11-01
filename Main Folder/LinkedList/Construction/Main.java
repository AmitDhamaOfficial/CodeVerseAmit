

class Node{
  int data;
  Node next;


  public Node(int data){
    this.data = data;
  }
}


class LinkedList {

    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Add a value at start in LinkedList:
    public void addFirst(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            tail = newNode;
        } else{
           newNode.next = head;
           head = newNode;
        }

        this.size++;
    }
    // Remove last node from linkedlist
    public void removeLast(){
        if(head == null){ // (size == 0)
            System.out.println("Nothing to remove, LinkedList is Empty!!!!!");
            return;
        } else if(head == tail){ // (size == 1)
            head = null;
            tail = null;
        } else{ 
            // reach second last Node
            Node temp = head;
            while(temp.next != null){
                Node tempKaNext = temp.next;
                temp = tempKaNext;
            }
            temp.next = null; // removing last Node
            tail = temp; // shifting tail

        }

        this.size--;
    }

    // Remove first node from linkedlist
    public void removeFirst(){
        if(head == null){
            head = null;
            System.out.println("There is nothing to remove!!!!!");
            return;
        } if(this.head == this.tail){
            head = null;
            tail = null;
        } else{
            Node headKaNext = head.next;
            head = headKaNext;
        }
        this.size--;
    }

    // Get Node at a particular index in LinkedList
    public Node getNodeAt(int idx){

        // for handle edge cases
        if(idx < 0 || idx > size){
            System.out.println("Index out of bounds!!!");
            return null;
        }

        Node temp = head;
        for(int i=0;i<idx;i++){
            Node tempKaNext = temp.next;
            temp = tempKaNext;
        }

        return temp;
    }

    // Add node at particular index in LinkedList
   public void addNodeAt(int idx, int value){


    // base condition
    if(idx < 0 || idx >= value){
        System.out.println("Index out of bound!!!");
        return;
    }

    if(idx == 0){
        addFirst(value);
        return;
    } else if(idx == size){
        addLast(value);
        return;
    }

    Node newNode = new Node(value);

    Node prevNode = getNodeAt(idx-1);
    Node nextNode = prevNode.next;

    prevNode.next = null; // disconnecting prev node with the rest of the ll
    prevNode.next = newNode; // connecting prev node with newNode

    newNode.next = nextNode; // connecting newNode with rest of linkedlist

    this.size++;


   }

// Remove node from particular index
public void removeNodeAt(int idx, int value){


    // base condition
    if(idx < 0 || idx >= value){
        System.out.println("Index out of bound!!!");
        return;
    }

    if(idx == 0){
        removeFirst();
        return;
    } else if(idx == size){
        removeLast();
        return;
    }

    // Node newNode = new Node(value);

    Node prevNode = getNodeAt(idx-1);
    Node nodeToDelete = prevNode.next;
    Node nextNode = nodeToDelete.next;

    prevNode.next = null; // breaking connection of prev node with the rest of the linkedlist
    prevNode.next = nextNode; // attaching prevNode with next of deleteNode

    // newNode.next = nextNode; // connecting newNode with rest of linkedlist

    this.size--;


   }
























    // print the complete LinkedList
    // don't read this function yet:
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }
}
















class Main{
  public static void main(String[] args){

    LinkedList ll = new LinkedList();

    // ll.addLast(5);
    // ll.addLast(10);
    // ll.addLast(15);
    // ll.addLast(20);
    // ll.addLast(25);

    // ll.addFirst(5);
    // ll.addFirst(10);
    // ll.addFirst(21);

    // ll.removeLast();

    // ll.removeFirst();

    // roughly try: 

    // ll.getNodeAt(52);
    // ll.getNodeAt(8);
    // ll.getNodeAt(46);
    // ll.getNodeAt(521);
    
    Node Ans = ll.getNodeAt(3);

    // ll.display();

    // ll.reverseLinkedList();

    // ll.display();


    System.out.println(Ans);
  }
}