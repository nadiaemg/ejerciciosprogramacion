package ejerciciosjava;

/**
 *Encuentra el mínimo de 3 números
 * @author nemg
 */
import java.util.Scanner;

public class Minimo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] numero = new double[3];
        double min = Double.MAX_VALUE;
        
        try{
            for (int i=0; i<3; i++) {
                System.out.print("Introduce un número ("+ (i+1) +"/3): ");
                numero[i] = sc.nextDouble();

                if (numero[i] < min) {
                    min = numero[i];
                }
            }
            System.out.println("El mínimo es: " + min);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos ingresados no son válidos");
        } finally {
            sc.close();
        }
    }
}