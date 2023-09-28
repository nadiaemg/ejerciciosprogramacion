package operadoreslogicos;

import java.util.Scanner;

/**
 *Comprueba si una persona es mayor de edad y tiene un permiso de conducir.
 * @author nemg
 */

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        try{
            System.out.print("¿Cuál es tu edad? (sólo número): ");
            int edad = sc.nextInt();
            sc.nextLine();
            
            if(edad >= 18 && edad <= 100){
                System.out.print("¿Tienes permiso de conducir? (Si/No): ");
                String conducir = sc.nextLine();
                
                String conducirMin = conducir.toLowerCase();
                
                if(conducirMin.contains("si") || conducirMin.contains("sí")){
                    System.out.println("Es mayor de edad y tiene permiso de conducir."); 
                    
                } else if (conducirMin.contains("no")){
                    System.out.println("Es mayor de edad pero no tiene permiso de conducir.");
                } else { 
                    System.out.println("Puede que los datos no sean correctos.");
                }
            } else if (edad < 18 && edad > 0){
                System.out.println("Es menor de edad.");
            } else {
                System.out.println("Puede que los datos no sean correctos.");
            }

        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
