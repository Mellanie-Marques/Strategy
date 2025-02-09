import java.util.Scanner;


// Classe Concreta Strategy de PayPal//
class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        if (validateCredentials()) {
            System.out.println("Pagamento de R$" + String.format("%.2f", amount) + " realizado com sucesso via PayPal!");
        } else {
            System.out.println("Falha na autenticação do PayPal.");
        }
    }

    private boolean validateCredentials() {
        // Simula a validação do email e senha no PayPal
        System.out.println("Validando credenciais do PayPal...");
        return email.equals("user@example.com") && password.equals("password123");
    }
}
