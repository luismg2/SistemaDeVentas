/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private int contadorProductos;
    

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, int idProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = idProducto;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Id: " +idProducto + ", producto: " + nombre + ", precio: " + precio ;
    }
    
    public static int alea(int li, int ls){
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
    
    
    
}
