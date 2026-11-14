import java.util.LinkedList;

class Node{
  int data;
  Node next;

  public Node(int data){
    this.data = data;

  }
}


class Main{
  public static void main(String[] args){
    Node n1 = new Node(5);
    Node n2 = new Node(10);
    Node n3 = new Node(15);
    Node n4 = new Node(20);


    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    System.out.println(n1.data); // n1 ~> 5
    System.out.println(n1.next.data); // n2 ~> 10
    System.out.println(n1.next.next.data); // n3 ~> 15
    System.out.println(n1.next.next.next.data); // n4 ~> 20
    
  }
}