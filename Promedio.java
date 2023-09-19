/**
 *Calcular el promedio de un arreglo de números.
 * @author nemg
 */
import java.util.Scanner;

public class Promedio {
    
    public static double sumar(double[] valores) {
        double suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("¿Cuántos datos tienes para calcular el promedio? ");
            int dimension = sc.nextInt();
            double[] datos = new double[dimension];
            
            for (int i=0; i< datos.length; i++) {
                System.out.print("Introduce un número ("+ (i+1) + "/" + dimension + "): ");
                datos[i] = sc.nextDouble();
            }
            
            double promedio = sumar(datos)/datos.length;
            System.out.println("El promedio es: " + promedio);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
