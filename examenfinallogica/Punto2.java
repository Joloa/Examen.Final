/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinallogica;

/**
 *
 * @author 503
 */
public class Punto2 {
    
    public static void main(String [] args){
        
        //Cree una matriz  3 * 3 en la que almacene las edades de sus familiares mas allegados. Cree un loop que recorra e imprima la matriz.
    
    int [][] edad = {{74,60,31},{29,16,22},{50,49,62}};
    
        for (int i=0; i<edad.length; i++){
            
            for (int j=0; j<edad[i].length; j++){
                
                System.out.println("La edad en la posición " + i + " - " + j + " es: " + edad[i][j]);                      
                
            }
            
        }
        
        System.out.println("------------------------------------");
        System.out.println("MATRIZ: ");
        
        for (int i=0; i<edad.length; i++){
            
            for (int j=0; j<edad[i].length; j++){
                
                System.out.print(edad[i][j] + "\t");                      
                
            }
            
            System.out.println("");
        }
    
    } 
    
    
}
