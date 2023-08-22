/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinallogica;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Punto1 {
    
    public static void main(String []args){
        
        //Cree una funcionalidad  que guarde en un array 6 nombres de compañeros, cree un ciclo que permita recorrerlo, 
        //muestre la extensión del mismo. Capture los nombres mediante el sistema.
        
        Scanner leer = new Scanner (System.in);
        
        String names[] = new String [6];
        
        System.out.println("Ingrese los nombres de 6 compañeros: ");
        names[0] = leer.nextLine();  
        names[1] = leer.nextLine(); 
        names[2] = leer.nextLine();  
        names[3] = leer.nextLine(); 
        names[4] = leer.nextLine(); 
        names[5] = leer.nextLine(); 
        
        System.out.println("-------------------");
        
        System.out.println("En total hay: " + names.length + " nombres de compañeros");
        
         System.out.println("-------------------");
        
        for (int i=0; i< names.length; i++){
            
            
            System.out.println("El nombre en la posición " + i + " es: " + names[i]);
            
        }
            
        
        
     
        
    }
    
}
