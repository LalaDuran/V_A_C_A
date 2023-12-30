package Entidades;

public class Usuario {

    private int id_usuario;
    private String nombre;
    private String contrasenia;
    private boolean administrador;

    public Usuario(int id_usuario, String nombre, String contrasenia, boolean administrador) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.administrador = administrador;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    
    
}
