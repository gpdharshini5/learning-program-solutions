package handson02_FinancialForecasting;

public class ForecastUtility {

    // Calculate average revenue growth rate
    public static double calculateGrowthRate(FinancialRecord[] records) {
        double totalGrowth = 0;
        for (int i = 1; i < records.length; i++) {
            double prev = records[i - 1].revenue;
            double curr = records[i].revenue;
            double growth = (curr - prev) / prev;
            totalGrowth += growth;
        }
        return totalGrowth / (records.length - 1);
    }

    // Forecast future years based on average growth
    public static FinancialRecord[] forecast(FinancialRecord[] history, int yearsToForecast) {
        double growthRate = calculateGrowthRate(history);
        FinancialRecord[] forecast = new FinancialRecord[yearsToForecast];
        FinancialRecord last = history[history.length - 1];

        for (int i = 0; i < yearsToForecast; i++) {
            int year = last.year + i + 1;
            double revenue = last.revenue * (1 + growthRate);
            double expense = last.expense * 1.05;
            forecast[i] = new FinancialRecord(year, revenue, expense);
            last = forecast[i]; 
        }

        return forecast;
    }
}