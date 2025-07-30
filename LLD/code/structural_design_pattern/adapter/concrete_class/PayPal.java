package LLD.code.structural_design_pattern.adapter.concrete_class;

public class PayPal {
    
    int money_paid;

    public void sendPayment(double amount) {
        this.money_paid += amount;
        System.out.println("Paid using PayPal: " + amount);
    }   
}
