package Entidades;

public class Usuario {

    private int id_usuario;
    private String nombre;
    private int dni;
    private boolean administrador;

    public Usuario(int id_usuario, String nombre, int dni, boolean administrador) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.dni = dni;
        this.administrador = administrador;
    }

    public Usuario(String nombre, int dni, boolean administrador) {
        this.nombre = nombre;
        this.dni = dni;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    
    
}
