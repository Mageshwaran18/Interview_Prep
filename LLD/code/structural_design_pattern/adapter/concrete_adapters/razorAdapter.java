package LLD.code.structural_design_pattern.adapter.concrete_adapters;
import LLD.code.structural_design_pattern.adapter.Interface.paymentGateWay;
import LLD.code.structural_design_pattern.adapter.concrete_class.RazorPay;

public class razorAdapter implements paymentGateWay {
     
    RazorPay razorPay;
    public razorAdapter(RazorPay razorPay) {
        this.razorPay = razorPay;
    }   

    @Override
    public void pay(double amount) {
        razorPay.processPayment(amount);
    }

}
