/**
 *Calcular el área de un círculo
 * @author nemg
 * a = π*r^2
 */
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        
        final double pi = 3.1416;
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingresa el radio del círculo para calcular su área: ");
            double radio = sc.nextDouble();

            double area = pi*(radio*radio);
            System.out.println("El área del círculo es: " + area);
            
        } catch (Exception err) {
            System.out.println("ERROR: El radio no es válido");
        } finally {
            sc.close();
        }
    }
}
