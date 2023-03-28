import List.ListaLigada;

public class Main {
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();

        System.out.println(list.getTamanho());
        list.adicionar("AC");
        list.adicionar("BA");
        list.adicionar("GO");
        list.adicionar("CE");

        System.out.println("Tamanho " + list.getTamanho());
        System.out.println("O primeiro "+list.getPrimeiro().getValor());
        System.out.println("O ultimo "+list.getUltimo().getValor());

      for(int i =0;i< list.getTamanho();i++){
          System.out.println(list.get(i).getValor());

      }
      //remover estado CE
      list.remover("AC");
        System.out.println("Removeu AC");

        for(int i =0;i< list.getTamanho();i++){
            System.out.println(list.get(i).getValor());

        }

    }
}