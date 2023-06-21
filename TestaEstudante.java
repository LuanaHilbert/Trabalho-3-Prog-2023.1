import java.util.Scanner;

public class TestaEstudante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        int opcao = 0;

        while (opcao != 9) {
            System.out.println("Menu:");
            System.out.println("(1) Cadastrar um novo estudante");
            System.out.println("(2) Alterar os dados de um estudante cadastrado");
            System.out.println("(3) Remover um estudante cadastrado");
            System.out.println("(4) Consultar um estudante cadastrado");
            System.out.println("(5) Listar os estudantes de uma disciplina");
            System.out.println("(6) Listar os estudantes com media abaixo de 6.0");
            System.out.println("(7) Listar os estudantes com media acima de 6.0");
            System.out.println("(8) Mostrar a media da turma");
            System.out.println("(9) Sair");

            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do estudante: ");
                    String nome = entrada.nextLine();
                    System.out.println("Digite o CPF do estudante: ");
                    String cpf = entrada.nextLine();
                    System.out.println("Digite a matricula do estudante: ");
                    String matricula = entrada.nextLine();
                    System.out.println("Digite a nota 1 do estudante: ");
                    float nota01 = entrada.nextFloat();
                    System.out.println("Digite a nota 2 do estudante: ");
                    float nota02 = entrada.nextFloat();

                    Estudante novoEstudante = new Estudante(nome, cpf, matricula, nota01, nota02);
                    disciplina.insereEstudante(novoEstudante);
                    System.out.println("Estudante cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite a matricula do estudante que deseja alterar: ");
                    String matriculaAlterar = entrada.nextLine();
                    boolean alterado = disciplina.alteraEstudante(matriculaAlterar);
                    if (alterado) {
                        System.out.println("Estudante alterado com sucesso!");
                    } else {
                        System.out.println("Estudante nao encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Digite a matricula do estudante que deseja remover: ");
                    String matriculaRemover = entrada.nextLine();
                    boolean removido = disciplina.removeEstudante(matriculaRemover);
                    if (removido) {
                        System.out.println("Estudante removido com sucesso!");
                    } else {
                        System.out.println("Estudante nao encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite a matricula do estudante que deseja consultar: ");
                    String matriculaConsultar = entrada.nextLine();
                    Estudante estudanteConsultado = disciplina.getEstudante(matriculaConsultar);
                    if (estudanteConsultado != null) {
                        System.out.println("Nome: " + estudanteConsultado.getNome());
                        System.out.println("Matricula: " + estudanteConsultado.getMatricula());
                        System.out.println("Nota 1: " + estudanteConsultado.getNota01());
                        System.out.println("Nota 2: " + estudanteConsultado.getNota02());
                        System.out.println("Media: " + estudanteConsultado.getMedia());
                    } else {
                        System.out.println("Estudante nao encontrado.");
                    }
                    break;

                case 5:
                    disciplina.listarEstudantes();
                    break;

                case 6:
                    disciplina.listaEstudantesAbaixo6();
                    break;

                case 7:
                    disciplina.listaEstudantesAcima6();
                    break;

                case 8:
                    float mediaTurma = disciplina.mediaTurma();
                    System.out.println("Media da turma: " + mediaTurma);
                    break;

                case 9:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

            System.out.println("-----------------------------------");
        }

        entrada.close();
    }
}
