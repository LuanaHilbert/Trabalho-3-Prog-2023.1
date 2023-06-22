public class Compromisso{
    private int hora;
    private String descricao;

    Compromisso(){

    }

    Compromisso(String descricao, int hora){
        this.descricao = descricao;
        this.hora = hora;
    }

    void setCompromissoCSV(String linha){
        String campos[] = linha.split(";");
        this.hora = Integer.parseInt(campos[0]);
        this.descricao = campos[1];
    }

    String getCompromissoCSV(){
        return this.hora + ";" + this.descricao;
    }

    int getHora(){
        return this.hora;
    }

    void setDescricao(String desc){
        this.descricao = desc;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Compromisso)) return false;
        Compromisso c = (Compromisso) o;
        return this.hora == c.hora;

    }

    public String toString(){
        return "Hora: "+ this.hora + "\nCompromisso: "+ this.descricao;
    }

}
