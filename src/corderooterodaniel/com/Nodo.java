package corderooterodaniel.com;

/**
 * Created by Carlos Daniel on 08/11/2017.
 */
public class Nodo {
    private int valor;
    private Nodo prox;

    public Nodo ( ){
        this.valor = 0;
        this. prox = null;
    }
    public Nodo (int V){
        this.valor = V;
        this.prox = null;
    }
    public void setValor(int V){
        valor = V;
    }
    public void setProx (Nodo P){
        prox = P;
    }
    public int getValor(){
        return valor;
    }
    public Nodo getProx(){
        return prox;
    }
}
