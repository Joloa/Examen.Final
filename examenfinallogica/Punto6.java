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
public class Punto6 {
    
    public static void main (String []args){
        
        //Empleando do- while, cree una funcionalidad que permita agregar de manera continua 7 números a una lista y salga de la misma al finalizar. 

        Scanner leer = new Scanner (System.in);
        
        int num[] = new int [7];
        
        int n=0;
        
        do{
            System.out.println("Ingrese un número: ");
            num[n] = leer.nextInt(); 
            n++;
            
        }while(n<7);
        
        System.out.println("-------------------------------");
        
        //Del ejercicio anterior cree un loop que recorra la lista e imprima los elementos.

        for (int i=0; i<7; i++){
            
            System.out.println("El número en la posición " + i + " es: " + num[i]);
            
        }
        
    }
    
}
