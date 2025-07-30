package LLD.code.structural_design_pattern.adapter;
import LLD.code.structural_design_pattern.adapter.Interface.*;
import LLD.code.structural_design_pattern.adapter.concrete_adapters.*;
import LLD.code.structural_design_pattern.adapter.concrete_class.*;

public class Main {

    public static void main(String[] args) {
        
        paymentGateWay paymentgateway = new paypalAdapter(new PayPal());

        paymentgateway.pay(100);

        paymentgateway = new razorAdapter(new RazorPay());

        paymentgateway.pay(200);

        paymentgateway = new stripeAdapter(new Stripe());

        paymentgateway.pay(300);
    }
    
}
