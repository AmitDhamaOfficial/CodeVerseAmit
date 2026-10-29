import java.util.*;

class LinkedList{
  Node head;
  Node tail;
  int size;


  public LinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;

//   public void addLast(int val){
//     Node newNode = new Node(val);

//     if(head == null){
//       head = newNode;
//       tail = newNode;
//     } else{
//       tail.next = newNode;
//       tail = newNode;
//     }

//     this.size++;
//   }
// }


// Add a value at start in LinkedList
  public void addFirst(int val){
    Node newNode = new Node(val);
  }

    if(head == null){
      head = newNode;
      tail = newNode;
    } else{
      newNode.next = head;
      head = newNode;
    }

    
    this.size++;
  }
}

  public static void main(String[] args){
    LinkedList ll = new LinkedList();

    ll.addFirst(5);

    ll.displayList();
  }