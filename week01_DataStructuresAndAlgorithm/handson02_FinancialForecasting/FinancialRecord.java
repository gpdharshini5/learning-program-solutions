package handson02_FinancialForecasting;

public class FinancialRecord {
    int year;
    double revenue;
    double expense;
    public FinancialRecord(int year, double revenue, double expense) {
        this.year = year;
        this.revenue = revenue;
        this.expense = expense;
    }
    public double getProfit() {
        return revenue - expense;
    }
    @Override
    public String toString() {
        return "Year: " + year +
                ", Revenue: ₹" + revenue +
                ", Expense: ₹" + expense +
                ", Profit: ₹" + getProfit();
    }
}
