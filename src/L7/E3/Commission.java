package L7.E3;

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.totalSales = 0;
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double payment = super.pay() + (commissionRate * this.totalSales);
        totalSales = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + this.totalSales;
        return result;
    }
}
