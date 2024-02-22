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
        double rate = 0.0035;
        double miles = (cashValue * rate);
        return miles;
    }
}
