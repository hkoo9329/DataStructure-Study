package week11_binary_tree.strudentSearchTree;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }
    public void insertBST(TreeNode node){
        root = insertKey(root,node);
    }

    public TreeNode insertKey(TreeNode root, TreeNode node) {
        TreeNode tmp = root;
        if (tmp == null) {
            return node;
        } else if (node.id < tmp.id) {
            tmp.left = insertKey(tmp.left, node);
            return tmp;
        } else if (node.id > tmp.id){
            tmp.right = insertKey(tmp.right, node);
            return tmp;
        }else
            return tmp;
    }

    public TreeNode searchBTS(int x){
        TreeNode tmp = root;
        while (tmp != null){
            if (x<tmp.id){
                tmp = tmp.left;
            }else if (x>tmp.id){
                tmp = tmp.right;
            }else{
                return tmp;
            }
        }
        return null;
    }


    public void inorder(TreeNode root){
        if (root != null){
            inorder(root.left);
            System.out.println(root.id+"\t"+root.name+"\t"+root.addr);
            inorder(root.right);
        }
    }

    public void printBST(){
        System.out.println("Binary Tree >>> ");
        inorder(root);
        System.out.println();
    }
}
