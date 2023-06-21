public class Estudante {
    private String matricula;
    private float nota01;
    private float nota02;
    private String nome;
    private String cpf;

    public Estudante(String nome, String cpf, String matricula, float nota01, float nota02) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    String getEstudanteCSV(){
        return this.nome + ";" + this.cpf + ";" this.matricula + ";" + this.nota01 + ";" + this.nota02;
    }

    void setEstudanteCSV(String linha){
        String campos[] = linha.split(";");
        this.nome = campos[0];
        this.cpf = campos[1];
        this.matricula = campos[2];
        this.nota01 = Float.parseFloat(campos[3]);
        this.nota02 = Float.parseFloat(campos[4]);
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

    public String getMatricula() {
        return matricula;
    }

    void setNota01(float nota01){
        this.nota01 = nota01;
    }

    public float getNota01() {
        return nota01;
    }

    void setNota02(float nota02){
        this.nota02 = nota02;
    }

    public float getNota02() {
        return nota02;
    }

    public float getMedia() {
        return (nota01 + nota02) / 2;
    }
}
