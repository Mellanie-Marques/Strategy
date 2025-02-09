
// Context Class
class Order {
    private double totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(totalAmount);
        } else {
            System.out.println("Nenhuma forma de pagamento selecionada.");
        }
    }
}
