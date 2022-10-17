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
public class Orden {
    private int idOrden;
    private Producto[] productos;
    private int contadorOrdenes;
    int maxProductos=10;

    public Orden() {
    }

    public Orden(int idOrden, Producto[] productos, int contadorOrdenes) {
        this.idOrden = idOrden;
        this.productos = productos;
        this.contadorOrdenes = contadorOrdenes;
    }
    
    
    
    public void agregarProducto(Producto producto){
        if(maxProductos!=0){
            productos[productos.length]=producto;
            maxProductos--;
        }else{
            System.out.println("La lista esta llena");
        }
    }
    
    public double calcularTotal(){
        double pago=0;
        for(int i=0;i<productos.length;i++){
            pago=pago+productos[i].getPrecio();
        }
        System.out.print("El total a pagar es: ");
        return pago;
    }
    
    public void mostrarOrden(){
        System.out.println("\t╔═══════════════╗\n"+"\t           TICKET\n"+"\t╚═══════════════╝\n");
        System.out.println("\t\tOrden: "+idOrden);
        System.out.println("\tHay "+productos.length+" productos en la lista\n");
        for(int i=0;i<productos.length;i++){
            System.out.println("\t»»——　"+productos[i].getNombre()+"   "+productos[i].getPrecio()+"€ ——««");
        }
        System.out.println("");
        calcularTotal();
    }
    
    
}
