package lista;

import List.elemento;

public class ListaEncadeada<T>{
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho=0;

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getultimo() {
        return ultimo;
    }

    public void setultimo(No<T> ultimo) {
        this.ultimo = ultimo;
    }

    public void adiciona(T elemento){
        No<T> celula= new No<T>(elemento);
        if(this.tamanho==0){
            this.inicio=celula;

        }else {
            this.ultimo.setProximo(celula);
        }
         this.ultimo=celula;
        this.tamanho++;

    }
    public int getTamanho(){
        return this.tamanho;
    }

    public void limpa(){
        for(No<T> atual= this.inicio;atual!=null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual= proximo;

        }
    }

    public static void main(String[] args) {
        ListaEncadeada <Integer>list = new ListaEncadeada<>();
        list.adiciona(1);
        System.out.println("Tamanho = "+list.getTamanho());
        System.out.println(list);

        list.adiciona(4);
        System.out.println(list);
        list.adiciona(8);

        System.out.println("Tamanho = "+list.getTamanho());

        list.limpa();
        System.out.println(list);

    }

    @Override
    public String toString() {
        if(this.tamanho==0){
            return "[]";

        }

        StringBuilder builder = new StringBuilder();
        No<T> atual= this.inicio;
        builder.append(atual.getElemento()).append(",");

        while(atual.getProximo()!=null){
          atual=atual.getProximo();
            builder.append(atual.getElemento()).append(",");

        }


        return builder.toString();


    }


   public No get(int posição){
         No atual = this.inicio;
        for(int i =0;i<posição;i++){

            if(atual.getProximo()!=null){
             atual=atual.getProximo();

            }

        }
        return atual;
   }
}
