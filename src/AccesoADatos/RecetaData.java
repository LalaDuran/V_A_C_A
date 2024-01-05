package AccesoADatos;

import Entidades.Categoria;
import Entidades.Receta;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class RecetaData {

    //atributo común a todos los Data
    private Connection con = null;

    public RecetaData() {

        //inicializa la variable con
        con = Conexion.getConexion();
    }

    public void guardarReceta(Receta receta) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "INSERT INTO receta (titulo,ingredientes,cuerpo,sin_tacc,categoria,ingrediente_principal,tipo_de_comida,forma_de_coccion,tipo_de_cocina) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            //Prepara el comando SQL con RETURN GENERATED KEYS para que devuelva el id_receta que es generado autoincremental
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Asignamos los valores a los parámetros dinámicos 
            ps.setString(1, receta.getTitulo());
            ps.setString(2, receta.getIngredientes());
            ps.setString(3, receta.getCuerpo());
            ps.setBoolean(4, receta.isSinTACC());
            ps.setString(5, receta.getCategoria().toString());
            ps.setString(6, receta.getIngredientePrincipal());
            ps.setString(7, receta.getTipoDeComida());
            ps.setString(8, receta.getFormaDeCoccion());
            ps.setString(9, receta.getTipoDeCocina());

            //Ejecutamos el comando SQL
            ps.executeUpdate();

            //Recuperamos el id_receta generado autoincremental
            ResultSet rs = ps.getGeneratedKeys();

            //Asignamos el id generado 
            if (rs.next()) {
                receta.setId_receta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Receta guardada");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
    }

    public void modificarReceta(Receta receta) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "UPDATE receta "
                + "SET titulo = ?, ingredientes = ?, cuerpo = ?, sin_tacc = ?, categoria = ?, ingrediente_principal = ?, tipo_de_comida = ?, forma_de_coccion = ?, tipo_de_cocina = ? "
                + "WHERE id_receta = ?";

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos los valores a los parámetros dinámicos
            ps.setString(1, receta.getTitulo());
            ps.setString(2, receta.getIngredientes());
            ps.setString(3, receta.getCuerpo());
            ps.setBoolean(4, receta.isSinTACC());
            ps.setString(5, receta.getCategoria().toString());
            ps.setString(6, receta.getIngredientePrincipal());
            ps.setString(7, receta.getTipoDeComida());
            ps.setString(8, receta.getFormaDeCoccion());
            ps.setString(9, receta.getTipoDeCocina());
            ps.setInt(10, receta.getId_receta());

            //Ejecutamos el comando SQL que devuelve un entero; creamos variable
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Receta modificada");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
    }

    public Receta buscarRecetaPorCategoria(String categoria) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "SELECT titulo, ingredientes, cuerpo, sin_tacc, ingrediente_principal, tipo_de_comida, forma_de_coccion, tipo_de_cocina "
                + "FROM receta "
                + "WHERE categoria = ?  ";

        //Creamos una receta en null para setearla luego
        Receta recetaABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setString(1, categoria);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos recetaABuscar y seteamos sus atributos
                recetaABuscar = new Receta();
                recetaABuscar.setCategoria(categoria);
                recetaABuscar.setTitulo(rs.getString("titulo"));
                recetaABuscar.setIngredientes(rs.getString("ingredientes"));
                recetaABuscar.setCuerpo(rs.getString("cuerpo"));
                recetaABuscar.setSinTACC(rs.getBoolean("sin_tacc"));
                recetaABuscar.setIngredientePrincipal(rs.getString("ingrediente_principal"));
                recetaABuscar.setTipoDeComida(rs.getString("tipo_comida"));
                recetaABuscar.setFormaDeCoccion(rs.getString("forma_de_coccion"));
                recetaABuscar.setTipoDeCocina(rs.getString("tipo_de_cocina"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe receta en esa categoría");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
        return recetaABuscar;
    }

    public Receta buscarRecetaPorIngredientePrincipal(String ingredientePrincipal) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "SELECT titulo, ingredientes, cuerpo, sin_tacc, categoria, tipo_de_comida, forma_de_coccion, tipo_de_cocina "
                + "FROM receta "
                + "WHERE ingrediente_principal = ?  ";

        //Creamos una receta en null para setearla luego
        Receta recetaABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setString(1, ingredientePrincipal);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos recetaABuscar y seteamos sus atributos
                recetaABuscar = new Receta();

                recetaABuscar.setIngredientePrincipal(ingredientePrincipal);
                recetaABuscar.setTitulo(rs.getString("titulo"));
                recetaABuscar.setIngredientes(rs.getString("ingredientes"));
                recetaABuscar.setCuerpo(rs.getString("cuerpo"));
                recetaABuscar.setSinTACC(rs.getBoolean("sin_tacc"));
                recetaABuscar.setCategoria(rs.getString("categoria"));
                recetaABuscar.setTipoDeComida(rs.getString("tipo_comida"));
                recetaABuscar.setFormaDeCoccion(rs.getString("forma_de_coccion"));
                recetaABuscar.setTipoDeCocina(rs.getString("tipo_de_cocina"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe receta con ese ingrediente");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
        return recetaABuscar;
    }

    public Receta buscarRecetaPorHorario(String tipoDeComida) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "SELECT titulo, ingredientes, cuerpo, sin_tacc, categoria, ingrediente_principal, forma_de_coccion, tipo_de_cocina "
                + "FROM receta "
                + "WHERE tipo_de_comida = ?  ";

        //Creamos una receta en null para setearla luego
        Receta recetaABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setString(1, tipoDeComida);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos recetaABuscar y seteamos sus atributos
                recetaABuscar = new Receta();

                recetaABuscar.setTipoDeComida(tipoDeComida);
                recetaABuscar.setTitulo(rs.getString("titulo"));
                recetaABuscar.setIngredientes(rs.getString("ingredientes"));
                recetaABuscar.setCuerpo(rs.getString("cuerpo"));
                recetaABuscar.setSinTACC(rs.getBoolean("sin_tacc"));
                recetaABuscar.setCategoria(rs.getString("categoria"));
                recetaABuscar.setIngredientePrincipal(rs.getString("ingrediente_principal"));
                recetaABuscar.setFormaDeCoccion(rs.getString("forma_de_coccion"));
                recetaABuscar.setTipoDeCocina(rs.getString("tipo_de_cocina"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe receta para ese horario");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
        return recetaABuscar;
    }

    public Receta buscarRecetaPorTipoDeCocina(String tipoDeCocina) {
        //Genera el comando SQL con los valores dinámicos
        String sql = "SELECT titulo, ingredientes, cuerpo, sin_tacc, categoria, ingrediente_principal, tipo_de_comida, forma_de_coccion "
                + "FROM receta "
                + "WHERE tipo_de_cocina = ?  ";

        //Creamos una receta en null para setearla luego
        Receta recetaABuscar = null;

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Asignamos el valor al parámetro dinámico
            ps.setString(1, tipoDeCocina);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //Instanciamos recetaABuscar y seteamos sus atributos
                recetaABuscar = new Receta();

                recetaABuscar.setTipoDeCocina(tipoDeCocina);
                recetaABuscar.setTitulo(rs.getString("titulo"));
                recetaABuscar.setIngredientes(rs.getString("ingredientes"));
                recetaABuscar.setCuerpo(rs.getString("cuerpo"));
                recetaABuscar.setSinTACC(rs.getBoolean("sin_tacc"));
                recetaABuscar.setCategoria(rs.getString("categoria"));
                recetaABuscar.setIngredientePrincipal(rs.getString("ingrediente_principal"));
                recetaABuscar.setTipoDeComida(rs.getString("tipo_de_comida"));
                recetaABuscar.setFormaDeCoccion(rs.getString("forma_de_coccion"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe receta para ese origen culinario");
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
        return recetaABuscar;
    }

    public List<Receta> listarReceta() {
        //Genera el comando SQL con los valores dinámicos
        String sql = "SELECT id_receta, titulo, ingredientes, cuerpo, sin_tacc,categoria,ingrediente_principal, tipo_de_comida, forma_de_coccion, tipo_de_cocina "
                + "FROM receta ";

        //Instanciamos el arraylist que usaremos luego
        ArrayList<Receta> recetas = new ArrayList<>();

        try {
            //Prepara el comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            //Ejecutamos el comando SQL que devuelve un ResulSet; creamos variable
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Instanciamos recetaABuscar y seteamos sus atributos
                Receta recetaABuscar = new Receta();
                recetaABuscar.setId_receta(rs.getInt("id_receta"));
                recetaABuscar.setTitulo(rs.getString("titulo"));
                recetaABuscar.setIngredientes(rs.getString("ingredientes"));
                recetaABuscar.setCuerpo(rs.getString("cuerpo"));
                recetaABuscar.setSinTACC(rs.getBoolean("sin_tacc"));
                recetaABuscar.setCategoria(rs.getString("categoria"));
                recetaABuscar.setIngredientePrincipal(rs.getString("ingrediente_principal"));
                recetaABuscar.setTipoDeComida(rs.getString("tipo_de_comida"));
                recetaABuscar.setFormaDeCoccion(rs.getString("forma_de_coccion"));
                recetaABuscar.setTipoDeCocina(rs.getString("tipo_de_cocina"));

                //Agregamos la receta encontrada al arraylist
                recetas.add(recetaABuscar);
            }

            //Liberamos recursos
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'receta'");
        } catch (NullPointerException ex) {

        }
        return recetas;
    }

}
