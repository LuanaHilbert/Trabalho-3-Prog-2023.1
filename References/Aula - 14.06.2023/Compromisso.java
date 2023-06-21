public class Compromisso{
    private Relogio hora;
    private String descricao;


    Compromisso(String descricao, Relogio hora){
        this.descricao = descricao;
        this.hora = hora;
    }

    Relogio getHora(){
        return this.hora;
    }

    void setDescricao(String desc){
        this.descricao = desc;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Compromisso)) return false;
        Compromisso c = (Compromisso) o;
        return this.hora.equals(c.hora);

    }

    public String toString(){
        return "Hora: "+ this.hora + "\nCompromisso: "+ this.descricao;
    }

}
