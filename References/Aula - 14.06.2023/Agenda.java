import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Agenda {
    ArrayList<Compromisso> lista;


    Agenda(){
        lista = new ArrayList<>();
    }

    Compromisso getCompromisso(int r){
    //retorna um compromisso a partir de uma hora enviada
        for (Compromisso c: lista){
            if (c.getHora() == r)
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

    void carregarDados() throws IOException{
        File arquivo = new File ("agenda.txt");

        if(arquivo.exists()){
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while((linha = br.readLine()) != null){
                Compromisso c = new Compromisso();
                c.setCompromissoCSV(linha);
                this.insereCompromisso(c);
            }
            br.close();
            fr.close();
        }
    }

    void gravarDados() throws IOException {
        File arquivo = new File("agenda.txt");
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for(Compromisso c : this.lista){
            pw.println(c.getCompromissoCSV());
        }
        pw.close();
        bw.close();
        fw.close();

    }

    void imprimeCompromissos(){

        for (Compromisso c: this.lista) {
            System.out.println("--------------");
            System.out.println(c);
        }
        System.out.println("----------------");

    }

}
