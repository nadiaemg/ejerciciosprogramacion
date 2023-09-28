package operadoreslogicos;

import java.util.Scanner;

/**
 *Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada legalmente.
 * @author nemg
 */

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        try{
            System.out.print("¿Cuál es tu edad? (sólo número): ");
            int edad = sc.nextInt();
            sc.nextLine();
            
            if(edad >= 18 && edad <= 100){
                System.out.print("¿Tienes credencial para votar? (Si/No): ");
                String ine = sc.nextLine();
                
                String ineMin = ine.toLowerCase();
                
                if(ineMin.contains("si") || ineMin.contains("sí")){
                    System.out.println("¡Puedes votar!");
                    
                    
                } else if (ineMin.contains("no")){
                    System.out.println("Por el momento no puedes votar.");
                } else { 
                    System.out.println("Puede que los datos no sean correctos.");
                }
            } else if (edad < 18 && edad > 0){
                System.out.println("Eres menor de edad");
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
