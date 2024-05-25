import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.printf("Digite o número da Conta!");
        numero = myObj.nextInt();
        System.out.printf("Por favor, digite o número da Agência!");
        agencia = myObj.nextLine();
        System.out.printf("Digite o seu nome:");
        nomeCliente = myObj.nextLine();
        System.out.printf("Entre com o seu saldo:");
        saldo = myObj.nextFloat();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo " + saldo +" já está disponível para saque");
    }
}