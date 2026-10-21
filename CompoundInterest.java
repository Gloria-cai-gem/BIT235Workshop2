public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000.00;
        double rate = 0.04;
        int years = 10;

        double amount = principal * Math.pow(1 + rate, years);
        double interest = amount - principal;

        System.out.println("Principal: $" + principal);
        System.out.println("Annual interest rate: " + (rate * 100) + "%");
        System.out.println("Time period: " + years + " years");
        System.out.printf("Amount after %d years: $%.2f%n", years, amount);
        System.out.printf("Compound interest earned: $%.2f%n", interest);
    }
}
