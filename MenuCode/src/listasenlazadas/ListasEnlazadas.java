/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import java.io.EOFException;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Lista lista =new Lista ();    
     int opcion=0;
     String nombre;
     
     do
     {
         try
         {
             opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "1.-Agregar Nombre del menu \n 2.-Imprimir Menu \n 3.-Salir ","Menú",3));
                     
             
             switch (opcion)
             {
                 case 1:
                     try{
                      nombre=JOptionPane.showInputDialog("Ingresa el nombre: ",3);
                      lista.insertarAlinicio(nombre); //agrega al nodo
                     }
                     catch (Exception e)
                     {
                         JOptionPane.showMessageDialog(null,"Debes ingresar un nombre ");
                      
                     }
                     break;
                 case 2:
                     lista.imprimirLista();
                     break;
                 case 3:
                     break;
                 default:
                  JOptionPane.showMessageDialog(null,"Debes ingresar una opcion valida ");
             }
         }
         catch (Exception e)
         {
           JOptionPane.showMessageDialog(null,"Debes ingresar una opcion valida ");

         }
         
     }while(opcion!=3);
     
    }
    
}
