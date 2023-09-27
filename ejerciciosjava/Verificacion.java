package ejerciciosjava;

/**
 *Verificar si un número es positivo, negativo o cero
 * @author nemg
 */
import java.util.Scanner;

public class Verificacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.println("Ingresa un número: ");
            double numero = sc.nextDouble();
            
            if (numero > 0){
                System.out.println("El número " + numero + " es positivo.");
            }
            else if (numero <0){
                System.out.println("El número " + numero + " es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
        } catch (Exception err) {
            System.out.println("ERROR: No es un número o el número es demasiado largo");
        } finally {
            sc.close();
        }
    }
}
