package week10_Tree.tree_reverse;

public class TreeReverse {

    public static void main(String[] args) {
        LinkedTree tree = new LinkedTree();

        TreeNode D = tree.makeBT(null,"D",null);
        TreeNode E = tree.makeBT(null,"E",null);
        TreeNode C = tree.makeBT(D,"C",E);
        TreeNode B = tree.makeBT(null,"B",null);
        TreeNode A = tree.makeBT(B,"A",C);

        A = tree.reverse(A);

        System.out.print("Preorder: \t");
        tree.preorder(A);
        System.out.println();

        System.out.print("Inorder: \t");
        tree.inorder(A);
        System.out.println();

        System.out.print("Postorder: \t");
        tree.postorder(A);
        System.out.println();
    }
}
