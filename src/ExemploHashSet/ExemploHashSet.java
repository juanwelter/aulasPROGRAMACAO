package ExemploHashSet;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("Arroz");
        lista.add("Tomate");
        lista.add("Feijão");
        lista.add("Arroz");
        System.out.println(lista);
    }
}
