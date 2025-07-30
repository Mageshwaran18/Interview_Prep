package LLD.code.structural_design_pattern.adapter.concrete_adapters;
import LLD.code.structural_design_pattern.adapter.Interface.paymentGateWay;
import LLD.code.structural_design_pattern.adapter.concrete_class.PayPal;

public class paypalAdapter implements paymentGateWay {

    private PayPal payPal;

    public paypalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(double amount) {
        payPal.sendPayment(amount);
    }
    
}
