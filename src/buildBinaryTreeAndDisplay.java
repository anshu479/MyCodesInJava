import java.util.Stack;

public class buildBinaryTreeAndDisplay {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Pair{
        Node node;
        int state;/// 1 --> add to left, 2--> add to right, 3--> pop form stack

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void dispaly(Node node) {
        if(node == null) {
            return;
        }
        String str = "";

        str += node.left == null? "." : node.left.data;
        str += " <- " + node.data + " -> ";
        str += node.right == null? ".": node.right.data;

        System.out.println(str);
        dispaly(node.left);
        dispaly(node.right);


    }

    public static void main(String[] args) {
        Integer arr[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 67, null, 70, null, null, 87, null, null};
        Node root = new Node(arr[0]);
        Pair rp = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rp);
        int index = 0;

        while(!st.isEmpty()) {
            Pair top = st.peek();
            if(top.state == 1) {
                index++;
                if (arr[index] != null) {
                    Node newNode = new Node(arr[index]);
                    top.node.left = newNode;
                    Pair np = new Pair(newNode, 1);
                    st.push(np);
                }
                top.state++;

            }
            else if(top.state == 2) {
                index++;
                if (arr[index] != null) {
                    Node newNode = new Node(arr[index]);
                    top.node.right = newNode;
                    Pair np = new Pair(newNode, 1);
                    st.push(np);
                }
                top.state++;

            }
            else if(st.peek().state == 3) {
                st.pop();
            }
        }

        dispaly(root);
    }
}
