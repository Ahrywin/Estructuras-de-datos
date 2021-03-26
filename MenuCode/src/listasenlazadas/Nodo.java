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
public class Nodo {
    public String nombre;
    public Nodo punteroEnlace;
    
     //constructor para insertar al inicio de la lista
   public Nodo (String n, Nodo d){ 
       nombre=n;//inicializar
       punteroEnlace=d;
    }
    
    //Constructor inserta al final de la lista
    public Nodo (String n){ 
        this.nombre=n;
    }
    
   
    
}
