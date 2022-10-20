/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Orden;
import Dominio.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Interfaz {
        public static void crearArchivo(String nombre){
        File archivo1=new File(nombre);
        try{
            PrintWriter salida=new PrintWriter(archivo1);
            salida.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
        
    public static void escribirArchivo(String nombre, ArrayList contenido){
        PrintWriter salida=null;
        File archivo=new File(nombre);
        try {//Se que el fcihero existe
            salida = new PrintWriter(archivo);
            int id=1;
            for(Object i:contenido){
                salida.println(id+".\t"+i);
                id++;
            }
            //salida.println(contenido);
        } catch (FileNotFoundException ex) {//El fichero no existe => Excep.
            ex.printStackTrace(System.out);
        } finally {//Este bloque siempre se ejecuta
            salida.close();
        }
        
    }

    


}
