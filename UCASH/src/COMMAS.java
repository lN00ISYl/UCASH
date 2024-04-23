
import java.text.NumberFormat;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karlo
 */
public class COMMAS extends DefaultTableCellRenderer  {
     private static final NumberFormat numberFormat = NumberFormat.getNumberInstance();

    public COMMAS() {
        setHorizontalAlignment(COMMAS.CENTER); // Align the content to the right
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Integer) {
            String formattedValue = numberFormat.format(value);
            setText(formattedValue);
        } else {
            setText("");
        }
    }
}
