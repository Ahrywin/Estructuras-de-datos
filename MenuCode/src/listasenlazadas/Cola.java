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
public class Cola {

    private static NodoCola first;

    public Cola() {
        first = null;
    }

    public static boolean vacio() {
        return first == null;
    }

    public static void insertar(Object dato) {
        if (vacio()) {
            NodoCola nuevo = new NodoCola(dato, null);
            first = nuevo;
        } else {
            NodoCola ultimo = first;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            NodoCola nuevo = new NodoCola(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }

    public void mostrar() {
        NodoCola temporal = first;
        System.out.println("\n4° Menu(cola)");
        while (temporal != null) {
            System.out.println("Nombre: "+temporal.getValor());
            temporal = temporal.getSiguiente();
        }
    }
}
