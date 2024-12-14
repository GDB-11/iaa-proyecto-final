package proyectofinal.helpers;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ElementosHelper {
    public static String getComboboxTexto(JComboBox comboBox) {
        return comboBox.getSelectedItem().toString();
    }

    public static void setTextFieldValue(JTextField textField, Object value) {
        if (value == null) {
            textField.setText("");
            
            return;
        }

        textField.setText(String.valueOf(value));
    }
}
