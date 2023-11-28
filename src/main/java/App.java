import javax.persistence.*;
import javax.swing.JFrame;
import messages.Util;
import views.MenuInicioSesion;

public class App {
    public static void main(String[] args) {
        
        JFrame pantalla;
        
        try {  
            
            // Inicio del Programa
            EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("PersistenciaTP");
            EntityManager manager = managerFactory.createEntityManager();
            
            pantalla = new MenuInicioSesion(manager);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            
            // Aviso de Problema
            Util.mensajeError("Error", "Ha ocurrido un error: \n" + e.getMessage());
            System.out.println("Error: \n" + e);
            
        } finally {
            
            // Fin del Programa
            //manager.close();
            //managerFactory.close();
            
        }
    }
}
