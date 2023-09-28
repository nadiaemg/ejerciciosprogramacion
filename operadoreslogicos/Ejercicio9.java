package operadoreslogicos;

/**
 *Determina si un usuario tiene acceso si ha ingresado un nombre de usuario y una contraseña válidos.
 * @author nemg
 */
import javax.swing.JOptionPane;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        String usuarioDefecto = "UsuarioPrueba";
        String contrasenaDefecto = "12345@";
                
        System.out.println("El usuario es: UsuarioPrueba\nLa contraseña es: 12345@\nEscribalos correctamente en el cuadro de diálogo");
        
        try{
            String usuario = JOptionPane.showInputDialog("Escriba el usuario:");
            String contrasena = JOptionPane.showInputDialog("Escriba la contraseña:");

            boolean acceso;

            if (acceso = (usuario.equals(usuarioDefecto) && contrasena.equals(contrasenaDefecto))){
                JOptionPane.showMessageDialog(null, "Datos correctos\nAcceso: " + acceso, "Bienvenido",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos\nAcceso: " + acceso, "Error",JOptionPane.ERROR_MESSAGE);
            }
        
        } catch (Exception err) {
            System.out.println("Operación cancelada");
        }
        
    }
}
