import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("SC","Florianópolis");
        capitais.put("MG","Belo Horizonte");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("RS","Rio Grande");
        System.out.println(capitais);
        for (String estado:capitais.keySet())
            System.out.println(estado+" ");
        for (String cidade:capitais.values())
            System.out.println(cidade+" ");
        System.out.println("\nA lista contém uma chave 'RS'?"+capitais.containsKey("RS"));
        System.out.println("\nA lista contém uma chave 'Porto Alegre'?"+capitais.containsKey("Porto Alegre"));

    }
}
