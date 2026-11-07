import java.util.HashMap;

class Main {

  public static char testByAmit(String s){
    HashMap <Character,Integer> hm = new HashMap<>();

    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);

      if(hm.containsKey(ch) == false){
        hm.put(ch,1);
      } else{
        int oldHm = hm.get(ch);
        hm.put(ch, oldHm+1);
      }
    }


    char ans = '\0';
    int maxNumber = 0;

    for(int i=0;i<s.length(); i++){
      char ch = s.charAt(i);

      if(hm.get(ch) > maxNumber){
        ans = ch;
        maxNumber = hm.get(ch);
      } else if(hm.get(ch) == maxNumber && ans > ch){
        ans = ch;
      }
    }

    return ans;
  }

  // Count elements with maximum frequency
  // https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

  






  public static void main(String[] args){

   char ans1 = testByAmit("testsample");

    System.out.println(ans1);

  }
}