package operadoreslogicos;

import java.util.Scanner;

/**
 *Determina si un triángulo es equilátero o isósceles
 * Equilatero tiene 3 lados iguales, isóceles tiene 2 lados iguales y uno desigual
 * @author nemg
 */
public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] lado = new double[3];
        
        try{ 
            for (int i=0; i<3; i++) {
                System.out.print("Introduce la medida de un lado del triángulo ("+ (i+1) +"/3): ");
                lado[i] = sc.nextDouble();
            }    
            
            if ((lado[0] == lado[1]) && (lado[0] == lado[2])){
                System.out.println("El triángulo es equilatero");
            } else if ((lado[0] == lado[1] && lado[0] != lado[2] && lado[1] != lado[2]) ||
                       (lado[0] != lado[1] && lado[0] == lado[2] && lado[1] != lado[2]) ||
                       (lado[2] == lado[1] && lado[0] != lado[2] && lado[1] != lado[0])){
                System.out.println("El triángulo es isóceles");
            } else{
                System.out.println("El triángulo es escaleno");
            }
  
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }  
}
