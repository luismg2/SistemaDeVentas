/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    private ArrayList<Producto> productlist=new ArrayList<>();
    private int idOrden;
    private int contadorOrdenes;
    int maxProductos=10;
    static Scanner ent = new Scanner(System.in);

    public Orden() {
    }

    public Orden(int idOrden) {
        this.idOrden = idOrden;
    }
    
    public Orden(int idOrden,ArrayList productlist) {
        this.idOrden = idOrden;
        this.productlist=productlist;
    }

    public ArrayList<Producto> getProductlist() {
        return productlist;
    }

    @Override
    public String toString() {
        return "\tOrden: " + idOrden+" productlist: (" + productlist+")";
    }
    
    
    
    
    public void agregarProducto(Orden o,Producto producto){
        if(maxProductos!=0){
            //productlist.add(producto);
            o.getProductlist().add(producto);
            maxProductos--;
            System.out.println("\nSe ha añadido el producto a la cesta");
        }else{
            System.out.println("\nNo hay mas espacio en la cesta");
        }
    }
    
    public void visualizar(Orden o){
        System.out.println("\nProductos en lista: " + (10-maxProductos));
        System.out.println("");
        int id=1;
        for(Producto i:o.getProductlist()){
            System.out.println(" "+id+". "+i.getNombre()+"  \t\t  "+i.getPrecio());
            id++;
        }
    }
    
    public double calcularTotal(Orden o){
        double pago=0;
        for(Producto i:o.getProductlist()){
            pago=pago+i.getPrecio();
        }
        System.out.print("\t El total a pagar es: "+pago);
        return 0;
    }
    
    public void mostrarOrden(Orden o){
        System.out.println("\n\t╔═══════════════╗\n"+"\t           TICKET\n"+"\t╚═══════════════╝\n");
        System.out.println("\t\tOrden: "+idOrden);
        System.out.println("\tHay "+o.getProductlist().size()+" productos en la lista\n");
        for(Producto i:o.getProductlist()){
            System.out.println(" »»——　"+i.getNombre()+"  \t  "+i.getPrecio()+"€ ——««");
        }
        System.out.println("");
        calcularTotal(o);
    }
    
    public void eliminar(Orden o){
        if(o.getProductlist().isEmpty()){
            System.out.println("\nDebe tener almenos un producto en la cesta para ejecutar esta accion\n");
        }else{
            visualizar(o);
            System.out.println(" "+0+". Salir\n");
            System.out.print("Introduzca el numero del producto que desee eliminar: ");
            int nproduct=ent.nextInt();
            while(nproduct<1 || nproduct>o.getProductlist().size()){
                System.out.print("Introduzca un número entre el 1 y el "+o.getProductlist().size()+": ");
                nproduct=ent.nextInt();
            }
            for(int i=0;i<o.getProductlist().size();i++){
                if(i==nproduct-1){
                    o.getProductlist().remove(i);
                    System.out.println("\nEl producto se ha eliminado con exito\n");
                    maxProductos++;
                    break;
                }
            } 

        }
    }
    
}
