import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            Scanner scanner = new Scanner(System.in);
            //int option = 0;
            // Acá debe ir la conversion
            // Deploy menu
            System.out.println("=======================================");
            System.out.println("    Welcome to Currency-Converter!");
            System.out.println("Please choose an option:");
            System.out.println(" ");
            System.out.println("1) USD to CRC");
            System.out.println("2) CRC to USD");
            System.out.println("3) EUR to CRC");
            System.out.println("4) CRC to EUR");
            System.out.println("5) COP to CRC");
            System.out.println("6) CRC to COP");
            System.out.println("7) Choose your own currencies");
            System.out.println(" ");
            System.out.println("8) End session");
            System.out.println("=======================================");


            int option = scanner.nextInt();
            askCurrency currency = new askCurrency();

            try{
                if (option == 8){
                    System.out.println("Thanks for choosing Currency-Converter!");
                    break;
                }

                // 1) USD to CRC
                if (option == 1){
                    Currency convertCurrency = currency.lookForCurrency("USD");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "CRC", amountConvert);
                }

                // 2) CRC to USD
                if (option == 2){
                    Currency convertCurrency = currency.lookForCurrency("CRC");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "USD", amountConvert);
                }

                // 3) EUR to CRC
                if (option == 3){
                    Currency convertCurrency = currency.lookForCurrency("EUR");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "CRC", amountConvert);
                }

                // 4) CRC to EUR
                if (option == 4){
                    Currency convertCurrency = currency.lookForCurrency("CRC");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "EUR", amountConvert);
                }

                // 5) COP to CRC
                if (option == 5){
                    Currency convertCurrency = currency.lookForCurrency("COP");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "CRC", amountConvert);
                }

                // 6) CRC to COP
                if (option == 6){
                    Currency convertCurrency = currency.lookForCurrency("CRC");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "COP", amountConvert);
                }

                // Free option
                if (option == 6){
                    Currency convertCurrency = currency.lookForCurrency("CRC");
                    System.out.println("Please type the amount of money you want to convert: ");
                    float amountConvert = scanner.nextFloat();
                    calculateConversion.calcConversionDef(convertCurrency, "COP", amountConvert);
                }

                if (option == 7){
                    calculateConversion.calcConversionMan();
                }

            }catch(Exception e){
                System.out.println("An error happened:" + e.getMessage());
            }
        }
    }
}