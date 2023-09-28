package operadoreslogicos;

/**
 *Comprueba si un número es mayor que 10 y menor que 20
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Compruebe si un número es mayor que 10 y menor que 20");
        
        try{ 
            System.out.print("Ingrese el número: ");
            double numero = sc.nextDouble();
            
            boolean resultado = (numero > 10) && (numero < 20);
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
