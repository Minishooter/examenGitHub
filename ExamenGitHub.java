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
            System.out.println("------- MENÚ OPCIONES---------");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción (1-4): ");
            opcion=scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
            
            case 1:
            System.out.print("Introduce la primera palabra: ");
            String palabra1 = scanner.nextLine();
            System.out.print("Introduce la segunda palabra: ");
            String palabra2 = scanner.nextLine();
            System.out.println("Resultado: " + palabra1 + palabra2);
            break;
            
            case 2:
                
            break;    
            
            case 3:
            System.out.println("Introduce una frase: ");
            String fraseParaContar = scanner.nextLine();
            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().charAt(0);
            int contador = 0;
            for (char c : fraseParaContar.toCharArray()) {
            if (c == letra) {
            contador++;
             }
            }
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
            break;
                
            case 4:    
 
             break;
                         
            default:
            System.out.println("Opción no válida.Selecciona una opción del 1 al 4.");
            break;
               
        }
        
        }while(opcion!=4);
        
        
    }
   
    
}
