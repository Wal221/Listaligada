package lista.teste;

import List.ListaLigada;
import lista.ListaEncadeada;

public class ListsaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada <Integer>list = new ListaEncadeada<>();
        list.adiciona(1);
        System.out.println("Tamanho = "+list.getTamanho());
        System.out.println(list);


        list.adiciona(4);
        System.out.println(list);

        list.adiciona(6);
        System.out.println(list);

        System.out.println("Tamanho = "+list.getTamanho());



    }
}
