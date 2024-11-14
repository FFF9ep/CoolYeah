import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class LocaleFormatter {
    public static void main(String[] args) {
        Locale[] locales = {Locale.US, Locale.FRANCE, new Locale("id", "ID")}; // US, France, Indonesia
        Scanner scanner = new Scanner(System.in);

        // Display locale information
        for (Locale locale : locales) {
            System.out.println("Locale: " + locale.toString());
            System.out.println("Language: " + locale.getDisplayLanguage());
            System.out.println("Country: " + locale.getDisplayCountry());
            System.out.println("Display Name: " + locale.getDisplayName());
            System.out.println();
        }

        // Input number and date
        System.out.print("Masukkan sebuah angka: ");
        double number = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Masukkan tanggal (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();
        Date date;
        try {
            date = new SimpleDateFormat("dd-MM-yyyy").parse(inputDate);
        } catch (ParseException e) {
            System.out.println("Tanggal tidak valid. Gunakan format dd-MM-yyyy.");
            return;
        }

        // Format number, currency, and date for each locale
        for (Locale locale : locales) {
            NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            Currency currency = Currency.getInstance(locale);
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);

            System.out.println("\nLocale: " + locale.toString());
            System.out.println("Formatted number: " + numberFormat.format(number));
            System.out.println("Formatted currency: " + currencyFormat.format(number));
            System.out.println("Currency symbol: " + currency.getSymbol(locale));
            System.out.println("Formatted date: " + dateFormat.format(date));
        }

        scanner.close();
    }
}
