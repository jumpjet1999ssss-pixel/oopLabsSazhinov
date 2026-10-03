public class ProgressiveIncomeTax extends IncomeTax { 
    private double secondRate; 
    private double incomeThreshold; 
    private String country;
    public ProgressiveIncomeTax(String name, double rate, String payer,
                            double income, double taxDeduction, int taxYear,
                            double secondRate, double incomeThreshold,
                            String country) {

    super(name, rate, payer, income, taxDeduction, taxYear);

    this.secondRate = secondRate;
    this.incomeThreshold = incomeThreshold;
    this.country = country;
    }

    public double calculateProgressiveTax() {
        double taxableIncome = calculateTaxableIncome();

        if (taxableIncome <= incomeThreshold) {
            return taxableIncome * getRate() / 100;
        }

        double firstPartTax =
                incomeThreshold * getRate() / 100;

        double secondPartTax =
                (taxableIncome - incomeThreshold) * secondRate / 100;

        return firstPartTax + secondPartTax;
    }

    public boolean isAboveThreshold() {
        return calculateTaxableIncome() > incomeThreshold;
    }

    public void printProgressiveInfo() {
        System.out.println("Страна: " + country);
        System.out.println("Первая ставка: " + getRate() + "%");
        System.out.println("Вторая ставка: " + secondRate + "%");
        System.out.println("Порог дохода: " + incomeThreshold);
        System.out.println("Итоговый налог: " + calculateProgressiveTax());
    }

    public double getSecondRate() {
        return secondRate;
    }

    public void setSecondRate(double secondRate) {
        this.secondRate = secondRate;
    }

    public double getIncomeThreshold() {
        return incomeThreshold;
    }

    public void setIncomeThreshold(double incomeThreshold) {
        this.incomeThreshold = incomeThreshold;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}