package week11_binary_tree.strudentSearchTree;

import java.io.*;

class TestMain {
    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree();
        String tmp = "";
        File file = new File("Student");
        try{
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while ((tmp = br.readLine()) != null){
                String[] str = tmp.split(" ");
                TreeNode record = new TreeNode();
                record.id = Integer.parseInt(str[0]);
                record.name = str[1];
                record.addr = str[2];
                searchTree.insertBST(record);
            }

            searchTree.printBST();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
