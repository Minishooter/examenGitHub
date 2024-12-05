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
                
            break;    
            
            case 3:
            System.out.print("Introduce una frase: ");
            String fraseParaContar = scanner.nextLine();
            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().charAt(0);
            int contador = 0;
            for (char c : fraseParaContar.toCharArray()) {
            if (c == letra) {
            contador++;
             }
            }
                break;
            case 4:    
 
                
            default:
            System.out.println("Opción no válida.Selecciona una opción del 1 al 4.");
        }
        
        
        
        
    }
   
    
}
