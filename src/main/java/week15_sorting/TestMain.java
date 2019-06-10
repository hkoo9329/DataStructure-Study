package week15_sorting;


import java.io.*;

public class TestMain {

    public static void main(String[] args) {

        Stud[] studs = getStudArray();
        Sorting sorting = new Sorting();

        System.out.println("Sorting Before");
        for (Stud s : studs) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.addr);
        }
        System.out.println("\nSorting Bubble");
        for (Stud s : sorting.bubleSort(studs.clone())) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.addr);
        }
        System.out.println("\nSorting Insert");
        for (Stud s : sorting.InsertSort(studs.clone())) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.addr);
        }
        System.out.println("\nSorting Quick");
        for (Stud s : sorting.quickSort(studs.clone(),0,studs.length-1)) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.addr);
        }
    }

    public static Stud[] getStudArray() {
        String tmp = "";
        File file = new File("Student");
        Stud[] studs = new Stud[10];
        int i = 0;
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while ((tmp = br.readLine()) != null) {
                String[] str = tmp.split(" ");
                Stud record = new Stud();
                record.id = Integer.parseInt(str[0]);
                record.name = str[1];
                record.addr = str[2];
                studs[i++] = record;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studs;
    }
}
