package ExemplosArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add(2,"C");
        System.out.println(lista);
        lista.add("F");
        lista.add("C");
        lista.add("L");
        System.out.println(lista);
        lista.sort(null);
        System.out.println(lista);

    }
}
