import java.io.IOException;
import java.util.Scanner;

public class TestaAgenda{
    public static void main(String[] args) throws IOException{

        Agenda my2023 = new Agenda();
        my2023.carregarDados();
        int h;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 para inserir \n2 para remover  \n3 para imprimir \n4 para alterar compromisso \n5 sair");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1: System.out.println("Digite descricao");
                        String desc = entradaStr.nextLine();

                        System.out.println("Digite hora");
                        h = entrada.nextInt();
                        Compromisso c = new Compromisso(desc, h);
                        my2023.insereCompromisso(c);
                        break;

                case 2: System.out.println("Digite hora");
                        h = entrada.nextInt();
                        Compromisso c2 = new Compromisso(" ", h);
                        my2023.removeCompromisso(c2);
                        break;


                case 3: my2023.imprimeCompromissos();
                        break;

                case 4: System.out.println("Digite hora");
                        h = entrada.nextInt();
                        Compromisso c3 = my2023.getCompromisso(h);
                        if (c3 != null){
                            System.out.println("Digite nova descrição");
                            String desc2 = entradaStr.nextLine();
                            c3.setDescricao(desc2);
                        }

                case 5: System.out.println("saindo");
                        my2023.gravarDados();
                        break;
                default: System.out.println("opção inválida");


            }
        } while(opcao != 5);

        entrada.close();
        entradaStr.close();
    }


}
