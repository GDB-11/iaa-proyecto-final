package proyectofinal.helpers;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.math.BigDecimal;

public class ElementosHelper {
    public static String getComboboxTexto(JComboBox comboBox) {
        return comboBox.getSelectedItem().toString();
    }

    public static Integer getComboboxSelectedIndex(JComboBox comboBox) {
        return comboBox.getSelectedIndex();
    }

    public static void setTextFieldValue(JTextField textField, Object value) {
        if (value == null) {
            textField.setText("");
            
            return;
        }

        textField.setText(String.valueOf(value));
    }

    public static void setTextAreaNewValue(JTextArea textArea, String text) {
        textArea.setText(text + "\n\n");
    }

    public static void printTextAreaNewLine(JTextArea textArea, String text) {
        textArea.append(text + "\n");
    }

    public static String getTextFieldValue(JTextField textField) {
        return textField.getText();
    }

    public static Integer getTextFieldIntValue(JTextField textField) {
        try {
            return Integer.parseInt(textField.getText());
        } catch (Exception e) {
            return 0;
        }        
    }
    
    public static Double getTextFieldDblValue(JTextField textField) {
        try {
            return Double.parseDouble(textField.getText());
        } catch (Exception e) {
            return 0.0;
        }        
    }
    
}
