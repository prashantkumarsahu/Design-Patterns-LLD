public class YAGNI {

    // Violating YAGNI: Adding a feature for future use
    class PaymentProcessor1 {
        public void processPayment1(String paymentMethod) {
            if (paymentMethod.equals("CreditCard")) {
                // process credit card payment
            } else if (paymentMethod.equals("PayPal")) {
                // process PayPal payment
            } else if (paymentMethod.equals("Bitcoin")) {
                // process Bitcoin payment (YAGNI)
            }
        }
    }

    // Following YAGNI: Implement only what is needed
    class PaymentProcessor2 {
        public void processPayment2(String paymentMethod) {
            if (paymentMethod.equals("CreditCard")) {
                // process credit card payment
            } else if (paymentMethod.equals("PayPal")) {
                // process PayPal payment
            }
        }
    }
}
