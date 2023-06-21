import java.util.ArrayList;

public class Agenda{
    ArrayList<Compromisso> lista;


    Agenda(){
        lista = new ArrayList<>();
    }

    Compromisso getCompromisso(Relogio r){
    //retorna um compromisso a partir de uma hora enviada
        for (Compromisso c: lista){
            if (c.getHora().equals(r))
                return c;
        }
        return null;
    }

    void insereCompromisso(Compromisso c){
        if (!lista.contains(c))
            lista.add(c);

        /* if (!existeCompromisso(c))
            lista.add(c); */
    }
    boolean existeCompromisso(Compromisso c){
        return lista.contains(c);
    }

    void removeCompromisso(Compromisso c){
        lista.remove(c);
    }

    void imprimeCompromissos(){

        for (Compromisso c: this.lista) {
            System.out.println("--------------");
            System.out.println(c);
        }
        System.out.println("----------------");

    }

}
