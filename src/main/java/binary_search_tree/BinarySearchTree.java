package binary_search_tree;

public class BinarySearchTree {

    private Node root = new Node();

    public Node insert(Node root, int x) {
        Node p = root;
        Node newNode = new Node(x);

        if (p == null) {
            return newNode;
        } else if (newNode.getData() < p.getData()) {
            p.setLeft(insert(p.getLeft(), x));
            return p;
        } else if (newNode.getData() > p.getData()) {
            p.setRight(insert(p.getRight(), x));
            return p;
        } else
            return p;
    }

    public void insert(int x) {
        root = insert(root, x);
    }

    public Node search(int x) {
        Node p = root;
        while (p != null) {
            if (x < p.getData())
                p = p.getLeft();
            else if (x > p.getData())
                p = p.getRight();
            else
                return p;
        }
        return p;
    }

    public void deleteBST(Node node, int x) {
        Node q = null;
        Node p = node;
        while (p != null) {
            if (p.getData() == x) {
                break;
            }
            q = p;
            if (x > p.getData()) {
                p = p.getRight();
            } else
                p = p.getLeft();
        }

        if (p == null)
            return;
        if (p.getLeft() == null && p.getRight() == null) {
            if (q.getLeft().equals(p)) {
                q.setLeft(null);
            } else
                q.setRight(null);

        } else if (p.getLeft() == null || p.getRight() == null) {
            if (p.getLeft() != null) {

            }
        }
    }

    public void inorder(Node root){
        if (root != null){
            inorder(root.getLeft());
            System.out.print(" "+root.getData());
            inorder(root.getRight());
        }
    }

    public void printBST(){
        inorder(root);
        System.out.println();
    }
}
