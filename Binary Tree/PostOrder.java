/*Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postToList(root, list);
        return list;
    }
    
    public void postToList(TreeNode root, List<Integer> list){
        if(root!=null){
            postToList(root.left, list);
            postToList(root.right, list);
            list.add(root.val);
        }
    }
}

//Recursive Way