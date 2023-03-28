package List;

public class elemento {
    private String valor;
    private elemento proximo;

    public String getValor() {
        return valor;
    }
    public elemento(String novoValor ){
        this.valor= novoValor;

    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public elemento getProximo() {
        return proximo;
    }

    public void setProximo(elemento proximo) {
        this.proximo = proximo;
    }
}
