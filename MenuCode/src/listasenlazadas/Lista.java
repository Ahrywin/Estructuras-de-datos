/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author julio
 */
public class Lista {

    protected Nodo punteroInicio, punteroFin;
    public int size = 0;

    //Constructor para inicializar los punteros
    public Lista() {
        punteroInicio = null;
        punteroFin = null;

    }

    //Agregar nodo al inicio de la lista
    public void insertarAlinicio(String item) {
        //crear nodo
        punteroInicio = new Nodo(item, punteroInicio);
        //validacion si exiten nodos
        if (punteroFin == null) {
            punteroFin = punteroInicio;
        }
    }

    //mostrar datos
    public void imprimirLista() {
        System.out.println("1° Menu");
        Nodo recorrer = punteroInicio;
        while (recorrer != null) {
            System.out.print(" Nombre -> " + recorrer.nombre);
            recorrer = recorrer.punteroEnlace;
        }
    }
    //mostar tamaña de la pila
    public void size(){
        System.out.println("\nTamaño del menu: "+size);
        //return size;
    }


}
