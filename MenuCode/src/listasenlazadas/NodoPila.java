/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Izhar Yahir
 */
public class NodoPila {
private Object valor;
    private NodoPila prox;

    public NodoPila (){
        this.valor=0;
        this.prox = null;
    }

    public NodoPila(Object v){
        this.valor = v;
        this.prox = null;
    }

    public void setValor(Object v){
        valor = v;
    }

    public void setProx(NodoPila p){
        prox = p;
    }

    public Object getValor(){
        return valor;
    }

    public NodoPila getProx(){
        return prox;
    }
}
