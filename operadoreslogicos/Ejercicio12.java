package operadoreslogicos;

import java.util.Scanner;

/**
 *Determina si una persona es adulta y no es jubilada.
 * @author nemg
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            
            /*if (edad >= 0 && edad <= 100){
                boolean adulto = edad >= 18;
                System.out.println("Es adulto: " + adulto);

                boolean jubilado = edad >= 65;
                System.out.println("Está jubilado: " + jubilado);
            } else {
                System.out.println("Edad no válida");
            }*/
            
            boolean resultado = edad >= 18 && edad < 65;
            System.out.println("Es adulto y no está jubilado: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
