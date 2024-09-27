package exercicioPessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Juan", "Welter"));
        lista.add(new Pessoa("Juan", "Welter"));
        lista.add(new Pessoa("Juan", "Welter"));
        lista.add(new Pessoa("Juan", "Welter"));
        lista.add(new Pessoa("Juan", "Welter"));
        lista.add(new Pessoa("Juan", "Welter"));
        System.out.println(lista);
    }
}