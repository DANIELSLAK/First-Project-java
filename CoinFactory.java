public class CoinFactory {
    public static Coin getCoinInstance(Coins coin) {
        Coin new_coin = null;
        switch (coin) {
            case ILS: {
                new_coin = new ILS();
                break;
            }
            case USD: {
                new_coin = new USD();
                break;
            }
        }
        return new_coin;
    }
}