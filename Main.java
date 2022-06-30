import java.util.*;
import java.io.*;
public class Main extends CoinFactory {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> results = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to currency convertor");
        char input2 = 'Y';
        while (input2 == 'Y') {
            System.out.println("Please choose an option(1/2) : ");
            System.out.println("1.Dollars to Shekels");
            System.out.println("2.Shekels to Dollars");
            double input = scanner.nextDouble();
            if (input == 1) {
                Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
                System.out.println("Please enter an amount to convert ");
                double input1 = scanner.nextDouble();
                double value = ilsValue.calculate(input1);
                System.out.println("The result is : " + value);
                results.add(value);

            }
            if (input == 2) {
                Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
                System.out.println("Please enter an amount to convert ");
                double input1 = scanner.nextDouble();
                double value = usdValue.calculate(input1);
                System.out.println("The result is : " + value);
                results.add(value);
            }
            System.out.println("You want to start over ? ");
            input2 = scanner.next().charAt(0);
            if (Objects.equals(input2, 'N')) {
                break;
            }
        }
        System.out.println("thanks ");
        System.out.println(results);
        FileWriter writer = new FileWriter("results.txt");
        for (Double i : results) {
            writer.write(i + System.lineSeparator());
        }
        writer.close();
    }
}