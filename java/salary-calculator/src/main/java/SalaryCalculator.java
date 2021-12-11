public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
         return daysSkipped < 5 ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * this.multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        double Salary = (1000.00* this.multiplierPerDaysSkipped(daysSkipped)) + this.bonusForProductSold(productsSold);
        return Salary < 2000.00 ? Salary : 2000.00;
    } 
}
