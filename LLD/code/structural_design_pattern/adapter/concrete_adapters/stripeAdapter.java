package LLD.code.structural_design_pattern.adapter.concrete_adapters;
import LLD.code.structural_design_pattern.adapter.Interface.paymentGateWay;
import LLD.code.structural_design_pattern.adapter.concrete_class.Stripe;


public class stripeAdapter implements paymentGateWay {

    Stripe stripe;

    public stripeAdapter(LLD.code.structural_design_pattern.adapter.concrete_class.Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        stripe.makeChange(amount);
    }
    
}
