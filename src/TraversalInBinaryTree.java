import java.util.Stack;

public class TraversalInBinaryTree {
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
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void preOrderTraversal(Node node) {
        if(node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void inOrderTraversal(Node node) {
        if(node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node) {
        if(node == null) {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
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
        System.out.print("preOrderTraversal - ");
        preOrderTraversal(root);
        System.out.print("inOrderTraversal - ");
        inOrderTraversal(root);
        System.out.print("postOrderTraversal - ");
        postOrderTraversal(root);

//        dispaly(root);
    }
}
