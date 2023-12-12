
package v_a_c_a;

import java.util.*;

public class Receta {

    private String titulo;
    private String ingredientes;
    private String cuerpo;
    private boolean sinTACC;
    private String categoria;
    private ArrayList<String> ingredientePpal;
    private TipoDeComida tipoComida;
    private FormaDeCoccion formaCoccion;
    private ArrayList<String> tipoDeCocina;

    public Receta(String titulo, String ingredientes, String cuerpo, boolean sinTACC, String categoria, ArrayList<String> ingredientePpal, TipoDeComida tipoComida, FormaDeCoccion formaCoccion, ArrayList<String> tipoDeCocina) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.cuerpo = cuerpo;
        this.sinTACC = sinTACC;
        this.categoria = categoria;
        this.ingredientePpal = ingredientePpal;
        this.tipoComida = tipoComida;
        this.formaCoccion = formaCoccion;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
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
        return formaCoccion;
    }

    public void setFormaCoccion(FormaDeCoccion formaCoccion) {
        this.formaCoccion = formaCoccion;
    }

    public ArrayList<String> getTipoDeCocina() {
        return tipoDeCocina;
    }

    public void setTipoDeCocina(ArrayList<String> tipoDeCocina) {
        this.tipoDeCocina = tipoDeCocina;
    }
    
    
}
