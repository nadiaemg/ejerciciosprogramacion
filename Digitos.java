/**
 *Suma de los digitos de un número
 * @author nemg
 */
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Ingresa un número entero para sumar sus digitos: ");
            int numero = sc.nextInt();
            //cambio de entero a string
            String cambio1 = Integer.toString(numero);
            int resultado = 0;

            for(int i=0; i<cambio1.length(); i++) {
                //cambio de string a numero
                int cambio2 = Integer.parseInt(String.valueOf(cambio1.charAt(i)));
                resultado += cambio2;
            }

            System.out.println("La suma es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: No es un número entero");
        } finally {
            sc.close();
        }
             
    }
}
