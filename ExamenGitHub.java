/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examengithub;

import java.util.Scanner;

public class ExamenGitHub {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);      
  
            int opcion = scanner.nextInt();
        
        do{
        
        switch (opcion){
            
            case 1:
                
            break;
            
            case 2:
            System.out.print("Introduce una frase: ");
            String frase = scanner.nextLine();
            String[] palabras = frase.split("\\s+");
            break;    
            
            case 3:
                
                break;
            case 4:    
 
                
            default:
            System.out.println("Opción no válida.Selecciona una opción del 1 al 4.");
        }
        
        
        
        
    }
   
    
}
