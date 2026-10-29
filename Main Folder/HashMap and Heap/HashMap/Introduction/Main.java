import java.util.HashMap;

class Main{
  public static void main(String[] args){
    // it is used to store <key,value> pairs

    // syntax:
    HashMap <String,Integer> map = new HashMap<>();

    // add: O(1)
    map.put("India",100);
    map.put("China",45);
    map.put("India",110);

    
    System.out.println(map);


    
    // contains: O(1)
    // nmap.containsKey("India"); error 1

    System.out.println(map.containsKey("India"));

    // get O(1) :
    System.out.println(map.get("India"));

    // remove : O(1)
    map.remove("China");


    System.out.println(map.get("China")); // default : null -> when not exist remove already.

    
   }
}