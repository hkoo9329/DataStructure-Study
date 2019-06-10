package week12_heap.student_heap;


import java.io.*;

public class HeapExam {

    public static void main(String[] args) {
        String tmp = "";
        Heap heap = new Heap();
        File file = new File("Student");
        try{
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while ((tmp = br.readLine()) != null){
                String[] str = tmp.split(" ");
                Stud record = new Stud();
                record.id = Integer.parseInt(str[0]);
                record.name = str[1];
                record.addr = str[2];
                heap.insertHeap(record);
            }
            System.out.println();
            heap.printHeap();
            while (heap.getHeapSize()>0){
                heap.deleteHeap();

            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
