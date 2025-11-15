package codewars.level7.algorithm;

import static java.util.regex.Pattern.matches;

public class CreditCardIssuerChecking {

    public static void main(String[] args) {
        System.out.println(getIssuer("4111111111111111"));  // Visa
        System.out.println(getIssuer("378282246310005"));   // AMEX
        System.out.println(getIssuer("9111111111111111"));  // UNKNOWN
        System.out.println(getIssuer("5105105105105100"));  // MASTERCARD
    }

    public static String getIssuer(String cardNumber) {
        if (cardNumber.startsWith("34") && cardNumber.length() == 15 || cardNumber.startsWith("37") && cardNumber.length() == 15) {
            return "AMEX";
        } else if (cardNumber.startsWith("6011") && cardNumber.length() == 16) {
            return "Discover";
        } else if (cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16)) {
            return "VISA";
        } else if ((cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") ||
                cardNumber.startsWith("54") || cardNumber.startsWith("55")) && cardNumber.length() == 16) {
            return "Mastercard";
        }
        return "Unknown";
    }

    public static String getIssuer1(String cn) {
        if (matches("^3[4|7].{13}$", cn)) return "AMEX";
        if (matches("^6011.{12}$", cn)) return "Discover";
        if (matches("^5[1-5].{14}$", cn)) return "Mastercard";
        if (matches("^4.{12}(...)?$", cn)) return "VISA";
        return "Unknown";
    }
}
