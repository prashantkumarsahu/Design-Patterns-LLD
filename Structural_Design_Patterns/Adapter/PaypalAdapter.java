package Adapter;

// To be written by Payment Aggregator
public class PaypalAdapter implements PaymentGateway{

  private PayPal payPalGateway;

  public PaypalAdapter(PayPal payPalGateway) {
    this.payPalGateway = payPalGateway;
  }

  @Override
  public void processPayment(double amount) {
    payPalGateway.makePaymentPaypal(amount);
  }
}
