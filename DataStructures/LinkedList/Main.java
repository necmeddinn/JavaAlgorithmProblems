import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ogrenciNo = new LinkedList<Integer>();
        ogrenciNo.add(4060);
        ogrenciNo.add(1030);
        ogrenciNo.add(5210);
        ogrenciNo.add(1075);
        ogrenciNo.add(4840);

        System.out.println(ogrenciNo);
        Collections.sort(ogrenciNo);
        System.out.println(ogrenciNo);
        System.out.println(ogrenciNo.getFirst());
        System.out.println(ogrenciNo.getLast() + "\n");
        ogrenciNo.addFirst(1020);

        for (int i : ogrenciNo) {
            System.out.println(i);
        }
        System.out.println("\n");

        Collections.sort(ogrenciNo, Collections.reverseOrder());
        System.out.println(ogrenciNo);
    }
}
