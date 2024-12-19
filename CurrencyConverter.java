import java.util.Scanner;

public class CurrencyConverter {

    // Conversion rates to various currencies
    private static final double RATE_INR_TO_USD = 0.012; // Indian Rupee to USD
    private static final double RATE_INR_TO_EUR = 0.011; // Indian Rupee to Euro
    private static final double RATE_INR_TO_GBP = 0.0094; // Indian Rupee to British Pound
    private static final double RATE_INR_TO_JPY = 1.68;  // Indian Rupee to Japanese Yen
    private static final double RATE_INR_TO_AUD = 0.018; // Indian Rupee to Australian Dollar

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter from Indian Rupees (INR)");
        System.out.println("1. Convert to USD");
        System.out.println("2. Convert to Euro (EUR)");
        System.out.println("3. Convert to British Pound (GBP)");
        System.out.println("4. Convert to Japanese Yen (JPY)");
        System.out.println("5. Convert to Australian Dollar (AUD)");
        System.out.println("6. Convert to all currencies");

        System.out.print("Choose an option (1-6): ");
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
                double inrAmount = scanner.nextDouble();
                double totalUsd = convertInrToUsd(inrAmount);
                double totalEur = convertInrToEur(inrAmount);
                double totalGbp = convertInrToGbp(inrAmount);
                double totalJpy = convertInrToJpy(inrAmount);
                double totalAud = convertInrToAud(inrAmount);

                System.out.printf("%.2f INR = %.2f USD%n", inrAmount, totalUsd);
                System.out.printf("%.2f INR = %.2f EUR%n", inrAmount, totalEur);
                System.out.printf("%.2f INR = %.2f GBP%n", inrAmount, totalGbp);
                System.out.printf("%.2f INR = %.2f JPY%n", inrAmount, totalJpy);
                System.out.printf("%.2f INR = %.2f AUD%n", inrAmount, totalAud);
                break;

            default:
                System.out.println("Invalid option, please select from 1 to 6.");
        }

        scanner.close();
    }
}
