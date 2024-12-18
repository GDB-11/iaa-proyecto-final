package proyectofinal.helpers;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MathHelper {
    public static String formatDecimal(Number number) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
        
        return df.format(number);
    }

    public static String formatPercentage(Number number) {
        DecimalFormat df = new DecimalFormat("#,##0.00%");
        df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
        return df.format(number);
    }

    public static String formatPercentageWithoutSymbol(Number number) {
        DecimalFormat df = new DecimalFormat("#,##0.########");
        df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
        return df.format(number.doubleValue() * 100);
    }

    public static Double parseToDouble(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0.0;
        }
        
        String cleanNumber = input.replace(",", "").trim();
        
        try {
            return Double.parseDouble(cleanNumber);
        } catch (NumberFormatException e) {
            return 0D;
        }
    }
}
