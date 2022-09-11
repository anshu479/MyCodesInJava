import java.util.Stack;

public class sizeSumMaxHeightOfBinaryTree {
    // size = number of node, sum = sum of all nodes, height = in terms of edges, max = the largest node value

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

    // finding size of Binary tree
    public static int size(Node node) {

        if(node == null) {
            return 0;
        }
        
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;

        return ts;
    }

//    finding sum of binary tree
    public static int sum(Node node) {
        if(node == null) {
            return 0;
        }

        int lsum = sum(node.left);
        int rsum = sum(node.right);
        int tsum = lsum + rsum + node.data;
        return tsum;
    }

    // finding max in binary tree
    public static int max(Node node) {
        if(node == null) {
            return Integer.MIN_VALUE;
        }

        int lmax = max(node.left);
        int rmax = max(node.right);
        int Max = Math.max(Math.max(lmax, rmax), node.data);
        return Max;
    }

    // finding height of a Binary tree
    public static int height(Node node) {
        if(node == null) {
            return -1;  // in terms of edges -> return -1 or in terms of nodes -> return 0
        }

        int lheight = height(node.left);
        int rheight = height(node.right);
        int theight = Math.max(lheight, rheight) + 1;
        return theight;
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

//        dispaly(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}

