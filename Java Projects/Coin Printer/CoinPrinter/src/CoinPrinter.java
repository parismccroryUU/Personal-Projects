import uulib.Console;

public class CoinPrinter {

    public static String getCoinValue(int coin) {
        switch (coin) {
            case 1:
                return "one penny";
            case 2:
                return "two pence";
            case 5:
                return "five pence";
            case 10:
                return "ten pence";
            case 20:
                return "twenty pence";
            case 50:
                return "fifty pence";
            case 100:
                return "one pound";
            case 200:
                return "two pounds";
            default:
                return "invalid coin value: " + coin;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Coin Value Converter ---");
        System.out.println("Enter a coin denomination");
        System.out.println("(1, 2, 5, 10, 20, 50, 100, 200)");

        int coin;

        do {
            coin = Console.getInt("Enter a coin value (or 0 to exit)");

            if (coin != 0) {
                String coinResult = getCoinValue(coin);
                System.out.println("=> " + coinResult);
            }

        } while (coin != 0);

        System.out.println("Thank you for using the Coin Converter.");
    }
}