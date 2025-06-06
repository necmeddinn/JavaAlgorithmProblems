import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Richard");

        names.add(0, "Necmeddin");

        names.set(3, "Sıdıka");

        System.out.println(names + "\n");
        Collections.sort(names);
        System.out.println(names.get(3) + "\n");
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println(names.size());
        names.remove(2);
        System.out.println(names);
    }
}
