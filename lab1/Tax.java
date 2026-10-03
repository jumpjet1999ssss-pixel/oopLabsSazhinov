public class Tax {
    private String name;
    private double rate;
    private String payer;

    public Tax(String name, double rate, String payer) {
        this.name = name;
        this.rate= rate;
        this.payer = payer;
    }

    public double calculateTax(double amount) {
        return amount * rate / 100;
    }

    public void printInfo() {
        System.out.println("Название налога: " + name);
        System.out.println("Ставка налога: " + rate + "%");
        System.out.println("Налогоплательщик: " + payer);
    }

    public boolean isHighRate() {
        return rate > 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }
}
