package Vistas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

//copiado del blogspot IdeasJava: https://ideasjava.blogspot.com/2008/04/cambiar-el-color-de-fondo-y-el-de.html
public class MyRenderer extends DefaultTableCellRenderer {

    Color background;
    Color foreground;

    public MyRenderer(Color background, Color foreground) {
        super();
        this.background = background;
        this.foreground = foreground;
        //para centrar las celdas del encabezado
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        comp.setBackground(background);
        comp.setForeground(foreground);
        
        return comp;
    }
}
