package operadoreslogicos;

import java.util.Scanner;

/**
 *Comprueba si un número es mayor que 100 o si es menor que -100
 * @author nemg
 */

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Comprueba si un número es\n a) mayor que 100 \n b) o menor que -100");
        
        try{ 
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            
            boolean a = numero > 100;
            System.out.println("El resultado para a): " + a);
            
            boolean b = numero < -100;
            System.out.println("El resultado para b): " + b);
            
            boolean resultado = numero > 100 || numero < -100;
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
