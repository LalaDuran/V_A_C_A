
package AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "v.a.c.a.";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "";
    private static Connection connection;
    
    private Conexion(){} //constructor privado
    
    public static Connection getConexion(){
        
        //Si no se ha establecido la conexión
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB,USUARIO,CONTRASENIA);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }
        return connection;
        
    }
}
