/*Escribir un programa que muestre los N primeros tÃ©rminos de la serie de Fibonacci. */

import java.util.Scanner; 

public class Ejercicio13{
    public static void main (String[]args){

        int numeroEntrada = 0; 
        int numeroAlmacenA = 0; 
        int numeroAlmacenB = 0;
        int numeroAlmacenC = 1; 
        Scanner sc = new Scanner (System.in); 
        
        System.out.println("Ingresa el numero que desas conocer de la serie: ");
        numeroEntrada = sc.nextInt(); 
    
        
        System.out.println("La serie es: ");
        for (int i = 0; i <= numeroEntrada; i++) {
            System.out.print(", " + numeroAlmacenB);
            
            numeroAlmacenA = numeroAlmacenB; 
            numeroAlmacenB = numeroAlmacenC;
            numeroAlmacenC = numeroAlmacenC + numeroAlmacenA;
            
        }
    }
}