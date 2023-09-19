/**
 *Calcular el número de dígitos en un número entero
 * @author nemg
 */
import java.util.Scanner;

public class Digitos2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            try{
                System.out.println("Ingresa un número entero para contar sus digitos: ");
                int numero = sc.nextInt();
                String cambio = Integer.toString(numero);
                
                System.out.println("El número de digitos en " + numero + " es: " + cambio.length());
                
            } catch (Exception err) {
            System.out.println("ERROR: No es un número entero");
            } finally {
                sc.close();
            }
    }            
}
