
package Entidades;

import java.util.*;

public class Receta {

    private String titulo;
    private String ingredientes;
    private String cuerpo;
    private boolean sinTACC;
    private int categoria;
    private ArrayList<String> ingredientePpal;
    private TipoDeComida tipoComida;
    private FormaDeCoccion formaDeCoccion;
    private ArrayList<String> tipoDeCocina;

    public Receta(String titulo, String ingredientes, String cuerpo, boolean sinTACC, int categoria, ArrayList<String> ingredientePpal, TipoDeComida tipoComida, FormaDeCoccion formaCoccion, ArrayList<String> tipoDeCocina) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.cuerpo = cuerpo;
        this.sinTACC = sinTACC;
        this.categoria = categoria;
        this.ingredientePpal = ingredientePpal;
        this.tipoComida = tipoComida;
        this.formaDeCoccion = formaCoccion;
        this.tipoDeCocina = tipoDeCocina;
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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIngredientePpal() {
        return ingredientePpal;
    }

    public void setIngredientePpal(ArrayList<String> ingredientePpal) {
        this.ingredientePpal = ingredientePpal;
    }

    public TipoDeComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(TipoDeComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    public FormaDeCoccion getFormaCoccion() {
        return formaDeCoccion;
    }

    public void setFormaCoccion(FormaDeCoccion formaCoccion) {
        this.formaDeCoccion = formaCoccion;
    }

    public ArrayList<String> getTipoDeCocina() {
        return tipoDeCocina;
    }

    public void setTipoDeCocina(ArrayList<String> tipoDeCocina) {
        this.tipoDeCocina = tipoDeCocina;
    }
    
    
}
