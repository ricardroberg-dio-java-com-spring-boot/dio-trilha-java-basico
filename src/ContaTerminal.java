import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, difite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Agora difite a agência: ");
        agencia = sc.next();
        System.out.println("Em seguida o nome e sobrenome do cliente: ");
        nomeCliente = sc.next();
        sc.next();
        System.out.println("Para finalizar, digite o saldo da conta: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
        sc.close();

    }

}
