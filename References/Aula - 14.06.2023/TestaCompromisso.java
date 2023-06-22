public class TestaCompromisso {
    public static void main(String args[]){
        Compromisso c = new Compromisso();
        c.setCompromissoCSV("8;consulta");

        System.out.println(c);
        System.out.println(c.getCompromissoCSV());
    }
}
