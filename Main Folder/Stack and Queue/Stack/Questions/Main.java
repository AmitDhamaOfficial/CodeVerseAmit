import java.util.ArrayList;
import java.util.Stack;

class Main {

  public static boolean isDuplicateBracket(String str) {
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == ')') {

        // if opening bracket at top, it's duplicate:
        if (st.peek() == '(') {
          return true;
        }

        // remove all the character until getting the open bracket:
        while (st.peek() != '(') {
          st.pop();
        }

        st.pop(); // removing opening bracket
      } else {
        st.push(ch); // push the element of a index until finding next ')' for perform operation
                     // again:
      }
    }

    return false;
  }

  // Leetcode 20 (Valid parenthesis)
  public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch == '(' || ch == '[' || ch == '{') {
        st.push(ch);
      } else if (ch == ')') {
        if (st.size() == 0 || st.peek() != '(')
          return false;

        st.pop(); // popping '('
      } else if (ch == '}') {
        if (st.size() == 0 || st.peek() != '{')
          return false;

        st.pop(); // popping '{'
      } else if (ch == ']') {
        if (st.size() == 0 || st.peek() != '[')
          return false;

        st.pop(); // popping '['
      }
    }
    return st.size() == 0;
  }

  // ================================================== NEXT GREATER ELEMENT =======================================================

  // Next Greater element on right
  // (https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1)
  public ArrayList<Integer> nextLargerElement(int[] arr) {
    int n = arr.length;

    int[] ngr = new int[n];
 
    Stack<Integer> st = new Stack<>(); // its better to store indices, we are storing elements for simplicity though

    for (int i = n - 1; i >= 0; i--) {
      int currentEle = arr[i];

      while (st.size() > 0 && st.peek() <= currentEle) {
        st.pop();
      }

      if (st.size() == 0) {
        ngr[i] = -1;
      } else {
        ngr[i] = st.peek();
      }
      st.push(currentEle);
    }


    ArrayList<Integer> res = new ArrayList<>();
    for (int i = 0; i < n; i++)
      res.add(ngr[i]);

    return res;
  }



 public ArrayList<Integer> nextGreaterElement(int[] arr){
  int n = arr.length;

  int[] ngr = new int[n]; // ngr -> next greter res:
  Stack<Integer> st = new Stack<>();

  for(int i=0;i<n;i++){
    int currentElement = arr[i];
    
    while(st.size() > 0 && st.peek() < currentElement ){
      ngr[st.pop()] = currentElement;
    }
    st.push(i);
  }

  while(st.size() > 0){
    ngr[st.pop()] = -1;
  }

  ArrayList<Integer> res = new ArrayList<>();
  for(int i=0;i<n;i++){
    res.add(ngr[i]);
  }

  return res;
 }
 
 

// 204 : Next Smaller on left
// https://www.geeksforgeeks.org/problems/smallest-number-on-left3403/1
class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int prev = -1;

            for (int j = i - 1; j >= 0; j--) {

                if (arr[j] < arr[i]) {
                    prev = arr[j];
                    break;
                }
            }

            ans.add(prev);
        }

        return ans;
    }
}




























  public static void main(String[] args) {

    // String str = "(a+(b)+(c+d))"; // Brackets are not duplicate!!!
    // String str = "((a+(b)+(c+d))))))"; // Brackets are duplicate!!!
    // String str = "((a+(b)+(c+d))"; // Brackets are not duplicate!!!
    String str = "((((((((a+(b)+(c+d))"; // Brackets are not duplicate!!!

    boolean isDuplicate = isDuplicateBracket(str);
    if (isDuplicate) {
      System.out.println("Brackets are duplicate!!!");
    } else {
      System.out.println("Brackets are not duplicate!!!");
    }
  }
}