/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import java.io.BufferedReader;
import java.io.EOFException;
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
        Lista lista = new Lista();
        int opcion = 0;
        String nombre;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.-Agregar Nombre del menu \n2.-Imprimir primer Menu "
                        + "\n3.-Crear un menu diferente \n4.-Mostar todos los menus \n5.-Salir ", "Menú", 3));

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
                        lista.imprimirLista();
                        break;
                    case 3:try {
                        nombre = JOptionPane.showInputDialog(null,"Ingresa el nombre: ","2° Menu",3);
                        creadorMenu(setMenu, nombre);//Agrega a la coleccion
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un nombre ");
                    }
                        break;
                    case 4:
                        lista.imprimirLista();
                        visualizarConjunto(setMenu);
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Debes ingresar una opcion valida ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar una opcion valida ");

            }

        } while (opcion != 5);

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
