
package Entidades;

import java.util.*;

public class Receta {

    private int id_receta;
    private String titulo;
    private String ingredientes;
    private String cuerpo;
    private boolean sinTACC;
    private String categoria;
    private String ingredientePrincipal;
    private String tipoDeComida;
    private String formaDeCoccion;
    private String tipoDeCocina;

    public Receta(int id_receta, String titulo, String ingredientes, String cuerpo, boolean sinTACC, String categoria, String ingredientePrincipal, String tipoDeComida, String formaDeCoccion, String tipoDeCocina) {
        this.id_receta = id_receta;
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.cuerpo = cuerpo;
        this.sinTACC = sinTACC;
        this.categoria = categoria;
        this.ingredientePrincipal = ingredientePrincipal;
        this.tipoDeComida = tipoDeComida;
        this.formaDeCoccion = formaDeCoccion;
        this.tipoDeCocina = tipoDeCocina;
    }

    public Receta(String titulo, String ingredientes, String cuerpo, boolean sinTACC, String categoria, String ingredientePrincipal, String tipoDeComida, String formaDeCoccion, String tipoDeCocina) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.cuerpo = cuerpo;
        this.sinTACC = sinTACC;
        this.categoria = categoria;
        this.ingredientePrincipal = ingredientePrincipal;
        this.tipoDeComida = tipoDeComida;
        this.formaDeCoccion = formaDeCoccion;
        this.tipoDeCocina = tipoDeCocina;
    }
    
    
    
    public Receta() {
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isSinTACC() {
        return sinTACC;
    }

    public void setSinTACC(boolean sinTACC) {
        this.sinTACC = sinTACC;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public String getFormaDeCoccion() {
        return formaDeCoccion;
    }

    public void setFormaDeCoccion(String formaDeCoccion) {
        this.formaDeCoccion = formaDeCoccion;
    }

    public String getTipoDeCocina() {
        return tipoDeCocina;
    }

    public void setTipoDeCocina(String tipoDeCocina) {
        this.tipoDeCocina = tipoDeCocina;
    }

    @Override
    public String toString() {
//        return titulo + '\n' + ingredientes + '\n' + '\n' + cuerpo +  '\n' + '\n' +"-  - - - - Ficha técnica - - - - -" + '\n'+ "¿Es libre de gluten?:  " + sinTACC + '\n'+
//                      "Categoría:             " + categoria + '\n' +
//                      "Ingrediente principal: " + ingredientePrincipal + '\n' +
//                      "Horario de comida:     " + tipoDeComida + '\n' + 
//                      "Forma de cocción:      " + formaDeCoccion + '\n' +
//                      "Tipo de cocina:        " + tipoDeCocina;
        
        return titulo +
                " " + ingredientes + " " + cuerpo + " " + "¿Es libre de gluten?:  " + sinTACC + " "+
                
                      "Categoría:             " + categoria + " " +
                      "Ingrediente principal: " + ingredientePrincipal + " " +
                      "Horario de comida:     " + tipoDeComida + " " + 
                      "Forma de cocción:      " + formaDeCoccion + " " +
                      "Tipo de cocina:        " + tipoDeCocina;
        
    }

    
    
    
}
