import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    private ArrayList<Estudante> turma;

    public Disciplina() {
        turma = new ArrayList<>();
    }

    public ArrayList<Estudante> getTurma() {
        return turma;
    }

    public void listarEstudantes() {
        for (Estudante estudante : turma) {
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Matricula: " + estudante.getMatricula());
            System.out.println("Nota 1: " + estudante.getNota01());
            System.out.println("Nota 2: " + estudante.getNota02());
            System.out.println("Media: " + estudante.getMedia());
            System.out.println("----------");
        }
    }

    public float mediaTurma() {
        float somaMedias = 0;
        for (Estudante estudante : turma) {
            somaMedias += estudante.getMedia();
        }
        return somaMedias / turma.size();
    }

    public Estudante getEstudante(String matricula) {
        for (Estudante estudante : turma) {
            if (estudante.getMatricula().equals(matricula)) {
                return estudante;
            }
        }
        return null;
    }

    public boolean insereEstudante(Estudante novo) {
        return turma.add(novo);
    }

    public boolean alteraEstudante(String matricula) {
        Estudante estudante = getEstudante(matricula);
        if (estudante != null) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o novo nome: ");
            String novoNome = entrada.nextLine();
            System.out.println("Digite o novo CPF: ");
            String novoCpf = entrada.nextLine();
            System.out.println("Digite a nova nota 1: ");
            float novaNota01 = entrada.nextFloat();
            System.out.println("Digite a nova nota 2: ");
            float novaNota02 = entrada.nextFloat();

            estudante.setNome(novoNome);
            estudante.setCpf(novoCpf);
            estudante.setNota01(novaNota01);
            estudante.setNota02(novaNota02);

            return true;
        }
        return false;
    }

    public boolean removeEstudante(String matricula) {
        Estudante estudante = getEstudante(matricula);
        if (estudante != null) {
            return turma.remove(estudante);
        }
        return false;
    }

    public void listaEstudantesAcima6() {
        for (Estudante estudante : turma) {
            if (estudante.getMedia() > 6.0) {
                System.out.println("Nome: " + estudante.getNome());
                System.out.println("Matricula: " + estudante.getMatricula());
                System.out.println("Nota 1: " + estudante.getNota01());
                System.out.println("Nota 2: " + estudante.getNota02());
                System.out.println("Media: " + estudante.getMedia());
                System.out.println("----------");
            }
        }
    }

    public void listaEstudantesAbaixo6() {
        for (Estudante estudante : turma) {
            if (estudante.getMedia() < 6.0) {
                System.out.println("Nome: " + estudante.getNome());
                System.out.println("Matricula: " + estudante.getMatricula());
                System.out.println("Nota 1: " + estudante.getNota01());
                System.out.println("Nota 2: " + estudante.getNota02());
                System.out.println("Media: " + estudante.getMedia());
                System.out.println("----------");
            }
        }
    }
}