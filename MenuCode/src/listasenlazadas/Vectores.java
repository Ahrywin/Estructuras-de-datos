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
public class Vectores {
    public int limite;
    
  public String nombre[]= new String[limite];
 
 
    
    public void AddElement(String dato,int lim)
    {
        //String nombre[]= new String[lim];
        limite = lim;
        //agregar al vector
        for(int i = 1; i<lim; i++){
            nombre[i]= dato;
        }
       

    }
  
    public void PrintElement()
    {
      //  System.out.println("- "+NombreMenu);
        for(int i = 1; i<limite;i++){
            System.out.println("-Nombre: "+nombre[i]);
        }
    
    }
    
    

    
}
