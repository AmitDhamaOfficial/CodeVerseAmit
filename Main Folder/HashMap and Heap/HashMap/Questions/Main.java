import java.util.HashMap;

class Main{

  // https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap <Character,Integer> freMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(freMap.containsKey(ch) == false){ // means check currentchar is not existing, is it??
                freMap.put(ch,1); // then puts/add by 1
            }else{ // if char already existing in HashMap then :
                int olderFreMap = freMap.get(ch);
                freMap.put(ch,olderFreMap+1); // add the freMap Integer value by 1.
            }
        }
        
        
        char ans = '\0'; // initialized with null
        int maxFre = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(freMap.get(ch) > maxFre){
                ans = ch;
                maxFre = freMap.get(ch);
            }else if(freMap.get(ch) == maxFre && ans > ch){
                ans = ch; // replacing with lexicographically smaller character
            }
        }
        
        return ans;
  }

// 3005. Count Elements With Maximum Frequency
// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
// Count elements with maximum frequency


// // Leetcode 349 (Intersection of two arrays)
  public static void main(String[] args){

  // char result1 = getMaxOccuringChar("testsample");
// int result2 = maxFrequencyElements();



  // System.out.println(result1);
// System.out.println(result2);

  }
}