package week10_Tree.tree_reverse;

public class LinkedTree {

    private TreeNode root;

    public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2){
        TreeNode root = new TreeNode();
        root.data =data;
        root.left = bt1;
        root.right = bt2;
        return root;
    }

    public void preorder(TreeNode root){
        if (root != null){
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void inorder(TreeNode root){
        if (root != null){
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }

    public void postorder(TreeNode root){
        if (root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);
        }
    }

    public TreeNode reverse(TreeNode root){
        if (root == null)
            return root;
        else{
            TreeNode left=reverse(root.left);
            TreeNode right=reverse(root.right);
            reverseLink(left, root,right);
        }
        return root;
    }

    public void reverseLink(TreeNode bt1, TreeNode root, TreeNode bt2){
        root.left = bt2;
        root.right = bt1;
    }
}
