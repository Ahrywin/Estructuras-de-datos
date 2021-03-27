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
public class NodoCola {

    private Object valor;
    private NodoCola Siguiente;

    public NodoCola(Object valor, NodoCola siguiente) {
        this.setValor(valor);
        setSiguiente(siguiente);
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoCola getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        Siguiente = siguiente;
    }
}
