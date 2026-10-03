public class IncomeTax extends Tax {
    private double income;
    private double taxDeduction;
    private int taxYear;

    public IncomeTax(String name, double rate,  String payer, double income, double taxDeduction, int taxYear) {
        super(name, rate, payer);
        
        this.income = income;
        this.taxDeduction = taxDeduction;
        this.taxYear = taxYear;
    }

    public double calculateTaxableIncome() {
        double taxableIncome = income - taxDeduction;

        if (taxableIncome < 0) {
            taxableIncome = 0;
        }
        return taxableIncome;
    }

    public  double calculateIncomeTax() {
        return calculateTax(calculateTaxableIncome());
    }

    public void printIncomeInfo() {
        System.out.println("Доход: " + income);
        System.out.println("Налоговый вычет: " + taxDeduction);
        System.out.println("Налоговый год" + taxYear);
        System.out.println("Облагаемый доход: " + calculateTaxableIncome());
    }

    public double getIncome() {
    return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTaxDeduction() {
        return taxDeduction;
    }

    public void setTaxDeduction(double taxDeduction) {
        this.taxDeduction = taxDeduction;
    }

    public int getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }
}