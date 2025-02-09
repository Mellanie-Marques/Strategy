import java.util.Scanner;

public class ECommercePayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cria um pedido
        Order order = new Order(150.00);

        System.out.println("Selecione o método de pagamento:");
        System.out.println("1: PayPal");
        System.out.println("2: Cartão de Crédito");
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (escolha == 1) {
            System.out.print("Informe o email: ");
            String email = scanner.nextLine();
            System.out.print("Informe a senha: ");
            String password = scanner.nextLine();
            order.setPaymentStrategy(new PayPalPayment(email, password));
        } else if (escolha == 2) {
            System.out.print("Informe o número do cartão (16 dígitos): ");
            String cardNumber = scanner.nextLine();
            System.out.print("Informe a data de expiração (MM/AA): ");
            String expirationDate = scanner.nextLine();
            System.out.print("Informe o código de segurança (3 dígitos): ");
            String securityCode = scanner.nextLine();
            order.setPaymentStrategy(new CreditCardPayment(cardNumber, expirationDate, securityCode));
        } else {
            System.out.println("Opção inválida.");
        }

        order.processOrder();
        scanner.close();
    }
}
