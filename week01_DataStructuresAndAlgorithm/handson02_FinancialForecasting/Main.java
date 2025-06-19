package handson02_FinancialForecasting;
public class Main {
    public static void main(String[] args) {
        // Historical records (last 3 years)
        FinancialRecord[] past = {
            new FinancialRecord(2021, 1000000, 600000),
            new FinancialRecord(2022, 1200000, 650000),
            new FinancialRecord(2023, 1440000, 700000)
        };

        System.out.println("=== Historical Financial Data ===");
        for (FinancialRecord r : past)
            System.out.println(r);

        // Forecast next 2 years
        FinancialRecord[] forecast = ForecastUtility.forecast(past, 2);

        System.out.println("\n=== Forecasted Financial Data ===");
        for (FinancialRecord r : forecast)
            System.out.println(r);
    }
}