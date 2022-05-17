package day07_unary_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100_000;
        double stateTaxRate = 0.08;  // 8%
        double federalTaxRate = 0.21;
        double stateTax, federalTax, salaryAfterTax, totalTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;
        String taxReport = "State tax rate: " + stateTaxRate + " , Federal tax rate: " + federalTaxRate + " , salary: $" + salary;
        System.out.println(taxReport);
    }
}
