public class RewardValue {

    public static void main(String[] args) {
    }
    double cashValue;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue;
    }
    public double convertMilesToCash(int miles, double conversionRate) {
        return miles * conversionRate;
    }

    public int convertCashToMiles(double cash, double conversionRate) {
        return (int) (cash / conversionRate);
    }
}
