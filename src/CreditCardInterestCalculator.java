public class CreditCardInterestCalculator {
    public static void main(String[] args) {
        double balance = 5000.00; // Initial credit card balance
        double annualInterestRate = 17.00; // Interest rate of 17%

        // Convert annual interest rate to monthly rate
        double monthlyInterestRate = annualInterestRate / (12 * 100);

        // Calculate interest after one month
        double interestMonth1 = balance * monthlyInterestRate;
        System.out.println("Interest after one month: $" + String.format("%.2f", interestMonth1));

        // Add first month's interest to the balance
        balance += interestMonth1;

        // Calculate interest after second month
        double interestMonth2 = balance * monthlyInterestRate;

        // Output statement
        System.out.println("Interest after two months: $" + String.format("%.2f", interestMonth1 + interestMonth2));
    }
}