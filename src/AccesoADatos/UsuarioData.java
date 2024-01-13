package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class UsuarioData {

    //atributo común a todos los Data
    private Connection con = null;

    public UsuarioData() {

        //inicializa la variable con
        con = Conexion.getConexion();
    }

    public void guardarUsuario(Usuario usuario) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "INSERT INTO usuario (nombre, dni, administrador) "
                + "VALUES (?,?,?)";

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el 
            //idMesa que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setString(1, usuario.getNombre());
            ps.setInt(2, usuario.getDni());
            ps.setBoolean(3, usuario.isAdministrador());

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el id_usuario generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();

            //Asignamos el id generado 
            if (rs.next()) {
                usuario.setId_usuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario guardado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'usuario'");
        } catch (NullPointerException ex) {

        }
    }

    public void modificarUsuario(Usuario usuario) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "UPDATE usuario "
                + "SET nombre = ?, dni = ?, administrador = ? "
                + "WHERE id_usuario = ?";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setString(1, usuario.getNombre());
            ps.setInt(2, usuario.getDni());
            ps.setBoolean(3, usuario.isAdministrador());
            ps.setInt(4, usuario.getId_usuario());

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario modificado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'usuario'");
        } catch (NullPointerException ex) {

        }
    }

    public List<Usuario> listarUsuario() {
        //Genera el comando SQL con los valores dinámicos
        String sql = "SELECT id_usuario, nombre, dni, administrador "
                + "FROM usuario ";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos usuarioABuscar y seteamos
                Usuario usuarioABuscar = new Usuario();
                usuarioABuscar.setId_usuario(rs.getInt("id_usuario"));
                usuarioABuscar.setNombre(rs.getString("nombre"));
                usuarioABuscar.setDni(rs.getInt("dni"));
                usuarioABuscar.setAdministrador(rs.getBoolean("administrador"));

                //Agregamos el usuario encontrado al arraylist
                usuarios.add(usuarioABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'usuario'");
        } catch (NullPointerException ex) {

        }
        return usuarios;
    }
 
    
    public Usuario buscarUsuarioPorID(int id) {
        
        String sql = "SELECT nombre, dni, administrador FROM usuario WHERE id_usuario = ?";
        //Creamos un usuario en null para setearlo luego
        Usuario usuarioABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id); 
            
            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos usuarioABuscar y seteamos
                usuarioABuscar = new Usuario();
                
                usuarioABuscar.setId_usuario(id);
                usuarioABuscar.setNombre(rs.getString("nombre"));
                usuarioABuscar.setDni(rs.getInt("dni"));
                usuarioABuscar.setAdministrador(rs.getBoolean("administrador"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe usuario con ese ID");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'usuario'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, ex.getStackTrace());
        }
        return usuarioABuscar;
    }

    public void eliminarUsuario (int id){
        String sql = "DELETE FROM usuario WHERE id_usuario = ? ";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setInt(1, id);

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'usuario'");
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, ex.getStackTrace());
        }
        
    }
    
    
}
