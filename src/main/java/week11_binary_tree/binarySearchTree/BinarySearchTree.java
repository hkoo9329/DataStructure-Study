package week11_binary_tree.binarySearchTree;

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = new TreeNode();
    }
    public void insertBST(int x){
        root = insertKey(root,x);
    }

    public TreeNode insertKey(TreeNode root, int x) {
        TreeNode tmp = root;
        TreeNode node = new TreeNode();
        node.data = x;
        node.left = null;
        node.right = null;
        if (tmp == null) {
            return node;
        } else if (node.data < tmp.data) {
            tmp.left = insertKey(tmp.left, x);
            return tmp;
        } else if (node.data > tmp.data){
            tmp.right = insertKey(tmp.right, x);
            return tmp;
        }else
            return tmp;
    }

    public TreeNode searchBTS(int x){
        TreeNode tmp = root;
        while (tmp != null){
            if (x<tmp.data){
                tmp = tmp.left;
            }else if (x>tmp.data){
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
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public void printBST(){
        System.out.print("Binary Tree >>> ");
        inorder(root);
        System.out.println();
    }
}
