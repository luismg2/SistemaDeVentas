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
    
    public void agregarProducto(Producto producto){
        if(maxProductos!=0){
            productlist.add(producto);
            maxProductos--;
            System.out.println("\nSe ha añadido el producto a la cesta");
        }else{
            System.out.println("\nNo hay mas espacio en la cesta");
        }
    }
    
    public void visualizar(){
        System.out.println("\nProductos en lista: " + (10-maxProductos));
        System.out.println("");
        int id=1;
        for(Producto i:productlist){
            System.out.println(" "+id+". "+i.getNombre()+"  \t\t  "+i.getPrecio());
            id++;
        }
    }
    
    public double calcularTotal(){
        double pago=0;
        for(Producto i:productlist){
            pago=pago+i.getPrecio();
        }
        System.out.print("\t El total a pagar es: "+pago);
        return pago;
    }
    
    public void mostrarOrden(){
        System.out.println("\n\t╔═══════════════╗\n"+"\t           TICKET\n"+"\t╚═══════════════╝\n");
        System.out.println("\t\tOrden: "+idOrden);
        System.out.println("\tHay "+productlist.size()+" productos en la lista\n");
        for(Producto i:productlist){
            System.out.println(" »»——　"+i.getNombre()+"  \t  "+i.getPrecio()+"€ ——««");
        }
        System.out.println("");
        calcularTotal();
    }
    
    public void eliminar(){
        if(productlist.isEmpty()){
            System.out.println("\nDebe tener almenos un producto en la cesta para ejecutar esta accion\n");
        }else{
            visualizar();
            System.out.println(" "+0+". Salir\n");
            System.out.print("Introduzca el numero del producto que desee eliminar: ");
            int nproduct=ent.nextInt();
            while(nproduct<1 || nproduct>productlist.size()){
                System.out.print("Introduzca un número entre el 1 y el "+productlist.size()+": ");
                nproduct=ent.nextInt();
            }
            for(int i=0;i<productlist.size();i++){
                if(i==nproduct-1){
                    productlist.remove(i);
                    System.out.println("\nEl producto se ha eliminado con exito\n");
                    maxProductos++;
                    break;
                }
            } 

        }
    }
    
}
