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
    static Producto p1=new Producto("Playstation",500);
    static Producto p2=new Producto("Xbox Series S",300);
    static Producto p3=new Producto("Nintendo Switch",350);
    static Producto p4=new Producto("Pc Gaming",950);
    static Producto p5=new Producto("Silla Gamer",150);
    static Producto p6=new Producto("Teclado Mecanico",69.99);
    static Producto p7=new Producto("Raton Logitech",99.99);
    static Producto p8=new Producto("Astro A50",300);
    static Producto p9=new Producto("Monitor ASUS 4k",250);    
    static Producto p10=new Producto("Tarjeta Nvidia 3090",1250);
    static Producto p11=new Producto("Cascos Xokas",10);
    
    public static void main(String[] args) {
        System.out.println("\t───── ❝ BIENVENIDO AL SISTEMA DE VENTAS ❞ ─────\n");
        
        menu();
        
        /*
        System.out.println("\t╔═══════════════╗\n"+"\t           TICKET\n"+"\t╚═══════════════╝\n");
        System.out.println("\t\tOrden: 150");
        System.out.println("\tHay 9"+" productos en la lista");
        System.out.println("\t»»——　"+"Alcachofa   "+"3€ ——««");
        */
        
    }
    
    public static void menu(){
        char sw;
        int opcion=-1;
        while(opcion!=0){
            System.out.println("MENÚ: SELECCIONE UNA OPCIÓN\n");
            System.out.println("\t(1) Agregar Productos a su lista");
            System.out.println("\t(2) Ver lista");
            System.out.println("\t(3) ");
            System.out.println("\t(4) Ejemplo del programa");
            System.out.println("\t(0) SALIR\n");
            System.out.print("Seleccione la opción a elegir: ");
            opcion=ent.nextInt();
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
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
    
    public static int alea(int li, int ls){
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
    
}
