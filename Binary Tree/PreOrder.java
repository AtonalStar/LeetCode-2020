/*Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();  
        pretoList(root,list);
        return list;
    }
    
    public void pretoList(TreeNode root, List<Integer> list){
        if(root!=null){
            list.add(root.val);
            pretoList(root.left, list);
            pretoList(root.right, list);
        }
    }
}

//Recursive Way