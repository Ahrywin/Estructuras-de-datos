/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class ListasEnlazadas {

    public static void main(String[] args) {
        Set<Coleccion> setMenu = new HashSet<>();
        Cola cola = new Cola();
        Pilas pila = new Pilas();
        Lista lista = new Lista();
        Vectores vector = new Vectores();
        int opcion = 0;
        int limiteUsuario = 0;
        String nombre;
        String nombrev;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.-Ingresa nombre del menu (Listas)\n2.-Ingresa nombre del menu (coleccion)"
                        + "\n3.-Ingresa vector menu  \n4.-Instertar nombre del menu (Cola) "
                        + "\n5.-Instertar nombre del menu (Pila)"
                        + "\n 6.-Mostar todas las estructuras de datos \n7.-Salir ", "Menú", 3));

                /*"1.-Ingresa nombre del menu (Listas)\n2.-Imprimir lista"
                        + "\n3.- Ingresa nombre del menu (coleccion) \n4.-Mostar todas las estructuras de datos "
                                + "\n5.-Instertar cola\n6.-Pilas \n7.-Salir ", "Menú", 3));*/
                switch (opcion) {
                    case 1:
                     try {
                        nombre = JOptionPane.showInputDialog("Ingresa el nombre: ", 3);
                        lista.insertarAlinicio(nombre); //agrega al nodo
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombre ");
                    }
                    break;

                    case 2:
                        try {
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ", " Menu", 3);
                        creadorMenu(setMenu, nombre);//Agrega a la coleccion
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombre ");
                    }
                    break;
                    case 3://Vectores
                        try {

                        limiteUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Limite del arreglo:", "limie", 3));
                        if (limiteUsuario > 0) {
                            vector.limite = limiteUsuario;

                            int lim = 0;
                            while (lim <= limiteUsuario) {

                                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre" + lim + ": ", " Menu", 3);
                                vector.AddElement(nombre, lim);//Agrega el vector

                                lim++;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El limite no debe ser 0 ni negativo ");
                            break;
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombredsfsd ");
                    }
                    break;
                    case 4:
                        try {
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ", "3° Menu-Cola", 3);
                        cola.insertar(nombre);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombredsfsd ");
                    }
                    break;

                    case 5:
                        try {
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ", "3° Menu-Pila", 3);
                        pila.push(nombre);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombredsfsd ");
                    }
                    break;
                    case 6:

                        lista.imprimirLista();
                        visualizarConjunto(setMenu);
                        vector.PrintElement();
                        cola.mostrar();
                        pila.peek();
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Debes ingresar una opcion valida ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar una opcion valida ");

            }

        } while (opcion != 7);

    }
//Creaccion de un Menu con Colecciones

    private static void creadorMenu(Set<Coleccion> setMenu, String nombre) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        setMenu.add(new Coleccion(nombre));
    }
//Visualiza la Coleccion

    public static void visualizarConjunto(Set<Coleccion> conjunto) {
        System.out.println("\n2° Menu");
        for (Coleccion menu : conjunto) {
            System.out.println("-" + menu.toString());
        }
    }
}
