/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Dominio.Orden;
import Dominio.Producto;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class SistemaDeVentas {
    static Orden o=new Orden();
    static Scanner ent = new Scanner(System.in);
    static Orden o1=new Orden(alea(100,999));
    
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n\t───── ❝ BIENVENIDO AL SISTEMA DE VENTAS ❞ ─────\n\n\n\n");
        pressAnyKeyToContinue();  
        menu();
        pressAnyKeyToContinue();  
        System.out.println("\n\n\n\n\t───── ❝ GRACIAS POR COMPRAR EN LUIS COMPONENTS ❞ ─────\n\n\n\n");


    }
    
    public static void menu(){
        char sw;
        int opcion=-1;
        while(opcion!=0){
            System.out.println("\t┌───── •✧✧• ─────┐\n" +
                               "\t           -MENÚ- \n" +
                               "\t└───── •✧✧• ─────┘\n");
            System.out.println("\t(1) Agregar Productos a su lista");
            System.out.println("\t(2) Ver Cesta");
            System.out.println("\t(3) Eliminar Producto");
            System.out.println("\t(4) Terminar Orden");
            System.out.println("\t(0) SALIR\n");
            System.out.print("Seleccione la opción a elegir: ");
            opcion=ent.nextInt();
            switch(opcion){
                case 1:
                    //ent.nextInt();
                    productos();
                    break;
                case 2:
                    o1.visualizar();
                    pressAnyKeyToContinue();  
                    break;
                case 3:
                    o1.eliminar();
                    pressAnyKeyToContinue();
                    break;
                case 4:
                    o1.mostrarOrden();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nIntroduzca un número entre 0 y ");
                    break;
            }
            for(int i=0;i<2;i++){
                System.out.println("");
            }
        }
    }

    public static void productos(){
        Producto p1=new Producto("Playstation 5",500);
        Producto p2=new Producto("Xbox Series S",300);
        Producto p3=new Producto("Nintendo Switch",350);
        Producto p4=new Producto("Pc Gaming",950);
        Producto p5=new Producto("Silla Gamer",150);
        Producto p6=new Producto("Teclado Mecanico",69.99);
        Producto p7=new Producto("Raton Logitech",99.99);
        Producto p8=new Producto("Astro A50",300);
        Producto p9=new Producto("Monitor ASUS 4k",250);    
        Producto p10=new Producto("Tarjeta Nvidia 3090",1250);
        Producto p11=new Producto("Cascos Xokas",10);
        System.out.println("\n\n\t  ┌─────★─────┐");
        System.out.println("\t        PRODUCTOS\n");
        System.out.println("  1."+p1.getNombre()+"\t\t"+p1.getPrecio());
        System.out.println("  2."+p2.getNombre()+"\t\t"+p2.getPrecio());
        System.out.println("  3."+p3.getNombre()+"\t\t"+p3.getPrecio());
        System.out.println("  4."+p4.getNombre()+"\t\t\t"+p4.getPrecio());
        System.out.println("  5."+p5.getNombre()+"\t\t\t"+p5.getPrecio());
        System.out.println("  6."+p6.getNombre()+"\t\t"+p6.getPrecio());
        System.out.println("  7."+p7.getNombre()+"\t\t"+p7.getPrecio());
        System.out.println("  8."+p8.getNombre()+"\t\t\t"+p8.getPrecio());
        System.out.println("  9."+p9.getNombre()+"\t\t"+p9.getPrecio());
        System.out.println("  10."+p10.getNombre()+"\t"+p10.getPrecio());
        System.out.println("  11."+p11.getNombre()+"\t\t"+p11.getPrecio());
        System.out.println("  0.Cancelar");
        System.out.println("");
        System.out.print("Introduzca el número del producto que desee añadir: ");
        int nproduct=ent.nextInt();
        while(nproduct<0||nproduct>11){
            System.out.print("Introduzca un número entre el 0 y el 11: ");
            nproduct=ent.nextInt();
        }
        if(nproduct==1){
            //Producto[] lista = null;
            o1.agregarProducto(p1);
        }else if(nproduct==2){
            o1.agregarProducto(p2);
        }else if(nproduct==3){
            o1.agregarProducto(p3);
        }else if(nproduct==4){
            o1.agregarProducto(p4);
        }else if(nproduct==5){
            o1.agregarProducto(p5);
        }else if(nproduct==6){
            o1.agregarProducto(p6);
        }else if(nproduct==7){
            o1.agregarProducto(p7);
        }else if(nproduct==8){
            o1.agregarProducto(p8);
        }else if(nproduct==9){
            o1.agregarProducto(p9);
        }else if(nproduct==10){
            o1.agregarProducto(p10);
        }else if(nproduct==11){
            o1.agregarProducto(p11);
        }else if(nproduct==0){
            //Este solo sirve para volver atras
        }
    }
    
    public static int alea(int li, int ls){
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }

    static public void pressAnyKeyToContinue(){
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulsa enter para continuar...");
        try{
            seguir = teclado.nextLine();
        }
        catch(Exception e){
        }
    }
}
