package List;

public class ListaLigada {

    private elemento primeiro;
    private elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(elemento primeiro) {
        this.primeiro = primeiro;
    }

    public elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }




    public void adicionar(String novoValor) {
        elemento novoElemento = new elemento(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }

        else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
            this.tamanho++;

    }


    public void remover(String valorProcurado) {
        elemento anterior=  null;
        elemento atual = this.primeiro;

        for(int i =0;i< this.getTamanho();i++){
          if(atual.getValor().equalsIgnoreCase(valorProcurado)){
              if(atual==primeiro){
              //nesse caso o primeiro vai passar a ser o proximo
              //ja que o primeiro e tambem o atual
              //por exemplo se o primeiro e AC sendo tambem o atual
              //O que se tornara o primeiro e oque esta adiante do AC ou seja o proximo
                  this.primeiro=atual.getProximo();
                  atual.setProximo(null);


              }else if(atual==ultimo){
                  this.ultimo=anterior;
                  anterior.setProximo(null);


              }else {
                  anterior.setProximo(atual.getProximo());
                  atual = null;

              }
              this.tamanho--;
              break;
          }
          anterior=atual;
            atual=atual.getProximo();
        }

    }

    public elemento get(int posiçao) {
        elemento atual= this.primeiro;
        for (int i =0 ;i< posiçao; i++){
            if(atual.getProximo()!=null){
                atual= atual.getProximo();
            }

        }
        return atual;

    }

}

