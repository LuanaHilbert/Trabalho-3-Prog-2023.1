public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
}
