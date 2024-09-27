package exercicioPessoa;

public class Pessoa {
    private String nome;
    private String sobrenme;

    public Pessoa(String nome, String sobrenme) {
        this.nome = nome;
        this.sobrenme = sobrenme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenme() {
        return sobrenme;
    }

    public void setSobrenme(String sobrenme) {
        this.sobrenme = sobrenme;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+" "+sobrenme;
    }
}
