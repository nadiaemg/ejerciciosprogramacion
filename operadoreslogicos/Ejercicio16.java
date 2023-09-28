package operadoreslogicos;

import java.util.Scanner;

/**
 *Comprueba si un número es múltiplo de 3 y no es múltiplo de 5.
 * @author nemg
 */

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            
            boolean a = numero % 3 == 0;
            System.out.println("El número es múltiplo de 3 es: " + a);
            
            boolean b = numero % 5 == 0;
            System.out.println("El número es múltiplo de 5 es: " + b);
            
            boolean c = numero % 3 == 0 && numero % 5 != 0;
            System.out.println("El resultado es: " + c);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
