package LLD.code.structural_design_pattern.adapter.concrete_class;

public class Stripe {
    
    int money_paid;

    public void makeChange(double money)
    {
        this.money_paid += money;
        System.out.println("Paid using Stripe: " + money);  
    }
}
