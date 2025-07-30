package LLD.code.structural_design_pattern.adapter.concrete_class;

public class RazorPay {
    
    int money_paid;

    public void processPayment(double amount) {
        this.money_paid += amount;
        System.out.println("Paid using RazorPay: " + amount);
    }
    
}
