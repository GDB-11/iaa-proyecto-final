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
}
