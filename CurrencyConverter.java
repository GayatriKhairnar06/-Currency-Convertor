import java.util.Scanner;

public class CurrencyConverter {

    // Conversion rates to various currencies
    private static final double RATE_INR_TO_USD = 0.012; // Indian Rupee to USD
    private static final double RATE_INR_TO_EUR = 0.011; // Indian Rupee to Euro
    private static final double RATE_INR_TO_GBP = 0.0094; // Indian Rupee to British Pound
    private static final double RATE_INR_TO_JPY = 1.68;  // Indian Rupee to Japanese Yen
    private static final double RATE_INR_TO_AUD = 0.018; // Indian Rupee to Australian Dollar
    private static final double RATE_INR_TO_CAD = 0.016; // Indian Rupee to Canadian Dollar
    private static final double RATE_INR_TO_CNY = 0.088; // Indian Rupee to Chinese Yuan
    private static final double RATE_INR_TO_SGD = 0.016; // Indian Rupee to Singapore Dollar
    private static final double RATE_INR_TO_AED = 0.044; // Indian Rupee to UAE Dirham

    // Convert Indian Rupees to USD
    public static double convertInrToUsd(double amount) {
        return amount * RATE_INR_TO_USD;
    }

    // Convert Indian Rupees to Euro
    public static double convertInrToEur(double amount) {
        return amount * RATE_INR_TO_EUR;
    }

    // Convert Indian Rupees to British Pound
    public static double convertInrToGbp(double amount) {
        return amount * RATE_INR_TO_GBP;
    }

    // Convert Indian Rupees to Japanese Yen
    public static double convertInrToJpy(double amount) {
        return amount * RATE_INR_TO_JPY;
    }

    // Convert Indian Rupees to Australian Dollar
    public static double convertInrToAud(double amount) {
        return amount * RATE_INR_TO_AUD;
    }

    // Convert Indian Rupees to Canadian Dollar
    public static double convertInrToCad(double amount) {
        return amount * RATE_INR_TO_CAD;
    }

    // Convert Indian Rupees to Chinese Yuan
    public static double convertInrToCny(double amount) {
        return amount * RATE_INR_TO_CNY;
    }

    // Convert Indian Rupees to Singapore Dollar
    public static double convertInrToSgd(double amount) {
        return amount * RATE_INR_TO_SGD;
    }

    // Convert Indian Rupees to UAE Dirham
    public static double convertInrToAed(double amount) {
        return amount * RATE_INR_TO_AED;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter from Indian Rupees (INR)");
        System.out.println("1. Convert to USD");
        System.out.println("2. Convert to Euro (EUR)");
        System.out.println("3. Convert to British Pound (GBP)");
        System.out.println("4. Convert to Japanese Yen (JPY)");
        System.out.println("5. Convert to Australian Dollar (AUD)");
        System.out.println("6. Convert to Canadian Dollar (CAD)");
        System.out.println("7. Convert to Chinese Yuan (CNY)");
        System.out.println("8. Convert to Singapore Dollar (SGD)");
        System.out.println("9. Convert to UAE Dirham (AED)");
        System.out.println("10. Convert to all currencies");

        System.out.print("Choose an option (1-10): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in INR: ");
                double inrToUsdAmount = scanner.nextDouble();
                double usd = convertInrToUsd(inrToUsdAmount);
                System.out.printf("%.2f INR = %.2f USD%n", inrToUsdAmount, usd);
                break;

            case 2:
                System.out.print("Enter the amount in INR: ");
                double inrToEurAmount = scanner.nextDouble();
                double eur = convertInrToEur(inrToEurAmount);
                System.out.printf("%.2f INR = %.2f EUR%n", inrToEurAmount, eur);
                break;

            case 3:
                System.out.print("Enter the amount in INR: ");
                double inrToGbpAmount = scanner.nextDouble();
                double gbp = convertInrToGbp(inrToGbpAmount);
                System.out.printf("%.2f INR = %.2f GBP%n", inrToGbpAmount, gbp);
                break;

            case 4:
                System.out.print("Enter the amount in INR: ");
                double inrToJpyAmount = scanner.nextDouble();
                double jpy = convertInrToJpy(inrToJpyAmount);
                System.out.printf("%.2f INR = %.2f JPY%n", inrToJpyAmount, jpy);
                break;

            case 5:
                System.out.print("Enter the amount in INR: ");
                double inrToAudAmount = scanner.nextDouble();
                double aud = convertInrToAud(inrToAudAmount);
                System.out.printf("%.2f INR = %.2f AUD%n", inrToAudAmount, aud);
                break;

            case 6:
                System.out.print("Enter the amount in INR: ");
                double inrToCadAmount = scanner.nextDouble();
                double cad = convertInrToCad(inrToCadAmount);
                System.out.printf("%.2f INR = %.2f CAD%n", inrToCadAmount, cad);
                break;

            case 7:
                System.out.print("Enter the amount in INR: ");
                double inrToCnyAmount = scanner.nextDouble();
                double cny = convertInrToCny(inrToCnyAmount);
                System.out.printf("%.2f INR = %.2f CNY%n", inrToCnyAmount, cny);
                break;

            case 8:
                System.out.print("Enter the amount in INR: ");
                double inrToSgdAmount = scanner.nextDouble();
                double sgd = convertInrToSgd(inrToSgdAmount);
                System.out.printf("%.2f INR = %.2f SGD%n", inrToSgdAmount, sgd);
                break;

            case 9:
                System.out.print("Enter the amount in INR: ");
                double inrToAedAmount = scanner.nextDouble();
                double aed = convertInrToAed(inrToAedAmount);
                System.out.printf("%.2f INR = %.2f AED%n", inrToAedAmount, aed);
                break;

            case 10:
                System.out.print("Enter the amount in INR: ");
                double inrAmount = scanner.nextDouble();
                double totalUsd = convertInrToUsd(inrAmount);
                double totalEur = convertInrToEur(inrAmount);
                double totalGbp = convertInrToGbp(inrAmount);
                double totalJpy = convertInrToJpy(inrAmount);
                double totalAud = convertInrToAud(inrAmount);
                double totalCad = convertInrToCad(inrAmount);
                double totalCny = convertInrToCny(inrAmount);
                double totalSgd = convertInrToSgd(inrAmount);
                double totalAed = convertInrToAed(inrAmount);

                System.out.printf("%.2f INR = %.2f USD%n", inrAmount, totalUsd);
                System.out.printf("%.2f INR = %.2f EUR%n", inrAmount, totalEur);
                System.out.printf("%.2f INR = %.2f GBP%n", inrAmount, totalGbp);
                System.out.printf("%.2f INR = %.2f JPY%n", inrAmount, totalJpy);
                System.out.printf("%.2f INR = %.2f AUD%n", inrAmount, totalAud);
                System.out.printf("%.2f INR = %.2f CAD%n", inrAmount, totalCad);
                System.out.printf("%.2f INR = %.2f CNY%n", inrAmount, totalCny);
                System.out.printf("%.2f INR = %.2f SGD%n", inrAmount, totalSgd);
                System.out.printf("%.2f INR = %.2f AED%n", inrAmount, totalAed);
                break;

            default:
                System.out.println("Invalid option, please select from 1 to 10.");
        }

        scanner.close();
    }
}
