
// Concrete Strategy for Credit Card
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String expirationDate;
    private String securityCode;

    public CreditCardPayment(String cardNumber, String expirationDate, String securityCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    @Override
    public void processPayment(double amount) {
        if (validateCard()) {
            System.out.println("Pagamento de R$" + String.format("%.2f", amount) + " realizado com sucesso via Cartão de Crédito!");
        } else {
            System.out.println("Falha na validação do cartão de crédito.");
        }
    }

    private boolean validateCard() {
        // Simula a validação do cartão
        System.out.println("Validando cartão de crédito...");
        return cardNumber.length() == 16 && securityCode.equals("123");
    }
}
