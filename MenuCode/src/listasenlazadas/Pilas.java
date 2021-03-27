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
public class Pilas {
    private NodoPila top;

    public Pilas(){
        top = null;
    }

    public boolean vacia(){
        return (top==null);
    }
    //Metodo insertar datos
    public void push(Object valor){
        NodoPila nuevoNodo;
        if( vacia() )
            top = new NodoPila(valor);
        else{
            nuevoNodo = new NodoPila(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    //Metodo mostrar datos
    public void peek(){
        NodoPila temp = top;
        if(temp !=null){
            System.out.println("5| Menú: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();

            }
        }
    }
    //Metodo buscar datos
    public void cima(){
        if( !vacia() ){
            System.out.println("Cima: "+top.getValor());
        }
        else
            System.out.println("La pila esta vacia");

    }
    // Metodo eliminar datos
    public void pop(){
        if( !vacia() ){
            System.out.println("Dato extraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }

}

