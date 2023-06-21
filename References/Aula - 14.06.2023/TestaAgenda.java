import java.util.Scanner;

public class TestaAgenda{

    public static void main(String[] args){



        Agenda my2023 = new Agenda();
        int h, m, s;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 para inserir \n2 para remover  \n3 para imprimir \n4 para alterar compromisso \n5 sair");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1: System.out.println("Digite descrição");
                        String desc = entradaStr.nextLine();

                        System.out.println("Digite hora, minuto e segundo");
                        h = entrada.nextInt();
                        m = entrada.nextInt();
                        s = entrada.nextInt();
                        Relogio r = new Relogio(h, m, s);
                        Compromisso c = new Compromisso(desc, r);
                        my2023.insereCompromisso(c);
                        break;

                case 2: System.out.println("Digite hora, minuto e segundo");
                        h = entrada.nextInt();
                        m = entrada.nextInt();
                        s = entrada.nextInt();
                        Relogio r1 = new Relogio(h, m, s);
                        Compromisso c2 = new Compromisso(" ", r1);
                        my2023.removeCompromisso(c2);
                        break;


                case 3: my2023.imprimeCompromissos();
                        break;

                case 4: System.out.println("Digite hora, minuto e segundo");
                        h = entrada.nextInt();
                        m = entrada.nextInt();
                        s = entrada.nextInt();
                        Relogio r2 = new Relogio(h, m, s);
                        Compromisso c3 = my2023.getCompromisso(r2);
                        if (c3 != null){
                            System.out.println("Digite nova descrição");
                            String desc2 = entradaStr.nextLine();
                            c3.setDescricao(desc2);
                        }

                case 5: System.out.println("saindo");
                        break;
                default: System.out.println("opção inválida");


            }
        } while(opcao != 5);

    }


}
