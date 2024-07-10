import java.util.Scanner;

public class calculateConversion {
    // Calculate Default
    public static void calcConversionDef(Currency currency, String toCurrency, double amount){
        if (currency.conversion_rates().containsKey(toCurrency)){
            double conv_rate = currency.conversion_rates().get(toCurrency);
            double conversion_result = amount*conv_rate;
            System.out.println("The result of the conversion is:");
            System.out.println(amount+" "+currency.base_code()+ "= "+ conversion_result + " "+ toCurrency);
        }
    }

    // Calculate with any currency
    public static void calcConversionMan(){
        askCurrency currency = new askCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the base code of your currency: ");
        String fromCurrency = scanner.nextLine();
        Currency convertCurrency = currency.lookForCurrency(fromCurrency);

        System.out.println("Please type the amount you want to convert: ");
        float amount = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please type the base code of the currency you want to convert to: ");
        String toCurrency = scanner.nextLine();

        calculateConversion.calcConversionDef(convertCurrency, toCurrency, amount);

    }
}
