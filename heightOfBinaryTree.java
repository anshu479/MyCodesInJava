class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        return findHeight(node);
    }
    
    static int findHeight(Node node) {
        if(node == null) {
            return 0;
        }
        return (Math.max(findHeight(node.left) ,findHeight(node.right)) + 1);
    }
}
