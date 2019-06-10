package week10_Tree.array_tree;

public class Traversal {
    public static void main(String[] args) {

        ArrayTree tree = new ArrayTree(32);

        for (int i=0;i<=6;i++) {
            tree.makeBT(String.valueOf((char)('A'+i)));
        }
        tree.makeBT(8,"H");
        tree.makeBT(10,"I");
        tree.makeBT(11,"J");
        tree.makeBT(15,"K");

        System.out.print("preorder: \t");
        tree.preorder(1);
        System.out.println();

        System.out.print("inorder: \t");
        tree.inorder(1);
        System.out.println();

        System.out.print("postorder: \t");
        tree.postorder(1);
        System.out.println();
    }
}
