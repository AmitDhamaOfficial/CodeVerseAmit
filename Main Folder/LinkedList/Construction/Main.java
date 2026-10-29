

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

    ll.addLast(5);
    ll.addLast(10);
    ll.addLast(15);
    ll.addLast(20);
    ll.addLast(25);

    ll.display();

    ll.reverseLinkedList();

    ll.display();
  }
}