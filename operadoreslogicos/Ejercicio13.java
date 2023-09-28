package operadoreslogicos;

import java.util.Scanner;

/**
 *Comprueba si un número es mayor que 5 y menor que 10 o si es mayor que 20 y menor que 30
 * @author nemg
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Comprueba si 5 < número < 10 o 20 < número < 30");
        
        try{ 
            System.out.print("Ingrese el número: ");
            int numero = sc.nextInt();
            
            boolean resultado = (numero > 5 && numero < 10) || (numero > 20 && numero < 30);
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
