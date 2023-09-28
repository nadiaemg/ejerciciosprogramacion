package operadoreslogicos;

import java.util.Scanner;

/**
 *Verifica si una persona tiene acceso a una sala VIP si es mayor de edad o si tiene una invitación especial.
 * @author nemg
 */

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        
        try{ 
            System.out.print("Ingrese su edad (sólo número): ");
            int edad = sc.nextInt();
            
            if (edad > 10 && edad < 100){
                System.out.print("¿Tiene una invitación especial? (Si/No): ");
                String invitacion = scanner.nextLine();

                boolean acceso = (edad >= 18) || invitacion.equalsIgnoreCase("si") || invitacion.equalsIgnoreCase("sí");
                System.out.println("Acceso a sala VIP: " + acceso);
            } else {
                System.out.println("Edad no válida");
            }
            
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
