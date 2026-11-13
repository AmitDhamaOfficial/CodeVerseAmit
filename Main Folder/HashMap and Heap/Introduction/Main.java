import java.util.HashMap;


class Main{
  public static void main(String[] args){
    // syntax :
    HashMap <String,Integer> map = new HashMap<>();

    // add:
    // complexity: O(1)

    map.put("India",100);
    map.put("China",200);
    map.put("Bangladesh",300);
    map.put("Russia",400);

    map.put("India",10000);

    // contains:
    // complexity: O(1)

    // map.containsKey("India");

    // for output:
    System.out.println(map.containsKey("India"));


  // for remove:
  // complexity: O(1)

  map.remove("China");


  // for getting:
  // complexity: O(1)

  // map.get("India");

  System.out.println(map.get("India"));
  }
}