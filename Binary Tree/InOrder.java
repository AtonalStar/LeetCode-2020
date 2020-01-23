/*Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();  
        inToList(root,list);
        return list;
    }
    
    public void inToList(TreeNode root, List<Integer> list){
        if(root!=null){
            inToList(root.left, list);
            list.add(root.val); 
            inToList(root.right, list);
        }
    }
}

//Recursive Way