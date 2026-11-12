import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node(int data) {
        this.data = data;
    }
}

class Main {
    public static Node constructTree(int[] dataArray) {
        if (dataArray.length == 0) {
            return null;
        }

        Stack<Node> st = new Stack<>();
        Node root = null;

        for (int i = 0; i < dataArray.length; i++) {
            int data = dataArray[i];

            if (data == -1) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                Node newNode = new Node(data);

                if (root == null) {
                    root = newNode;
                } else {
                    Node topNode = st.peek();
                    topNode.children.add(newNode);
                }

                st.push(newNode);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] dataArray = {10, 20, 50, -1, 60, -1, -1, 30, -1, -1};
        Node root = constructTree(dataArray);
        System.out.println(root.data);
    }
}