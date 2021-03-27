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
public class Coleccion {
    private String nombre;

    public Coleccion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coleccion menu = (Coleccion) o;

        return nombre != null ? nombre.equals(menu.nombre) : menu.nombre == null;
    }
    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }
}
