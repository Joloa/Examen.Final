/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinallogica;

/**
 *
 * @author 503
 */
public class Punto3 {
    
    public static void main (String []args){
        
        //Los siguientes son los datos de 3  jugadores de futbol: Jugador 1, Juan, “15 años”, delantero. 
        //Jugador 2: Pedro, “16 años” , defensa. Jugador 3: Luis , “17 años”, arquero. Cree una loop que imprima la información de los jugadores.

        String datos [][]= {{"Nombre:", "Edad:", "Posición:"}, {"Juan", "15 años", "Delantero"}, {"Pedro", "16 años", "Defensa"}, {"Luis", "17 años", "Arquero"}};      
        
        System.out.println("Información de los jugadores: ");
        
        System.out.println("----------------------------");
                    
        for (int i = 0; i < datos.length; i++){
            for (int j = 0; j<datos[i].length; j++){
                System.out.print(datos[i][j] + "\t");
            }  
          
            System.out.println("");
          
        }
        
        //4. Indique la posición de arquero en el ejercicio anterior. Acceda al elemento. 
        
         System.out.println("------------------------------------");
        
        System.out.println("La posición del " + datos[3][2] + " es: 3,2");
        
        System.out.println("------------------------------------");
        
        
        //5. Indique la posición de “16 años”. Acceda al elemento.
        
        System.out.println("La posición de " + datos[2][1] + " es: 2,1");

                                                  
    }
        
             
}
    

