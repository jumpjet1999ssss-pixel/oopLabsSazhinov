public class Main { 
    public static void main(String[] args) {
        ProgressiveIncomeTax tax = new ProgressiveIncomeTax(
            "Подоходный налог",
            13,
            "Иван",
            1000000,
            100000,
            2026,
            20,
            500000,
            "ооп"
        );

        System.out.println("=== ОБЩАЯ ИНФОРМАЦИЯ ===");
        tax.printInfo();

        System.out.println();

        System.out.println("=== ИНФОРМАЦИЯ О ДОХОДЕ ===");
        tax.printIncomeInfo();

        System.out.println();

        System.out.println("=== ПРОГРЕССИВНЫЙ НАЛОГ ===");
        tax.printProgressiveInfo();

        System.out.println();

        System.out.println(
                "Ставка налога высокая: " + tax.isHighRate()
        );

        System.out.println(
                "Доход превышает порог: " + tax.isAboveThreshold()
        );
    }
}