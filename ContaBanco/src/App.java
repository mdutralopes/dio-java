import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.print("Digite o número da conta: ");
        contaTerminal.numConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número da agência: ");
        contaTerminal.agencia = sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        contaTerminal.nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        contaTerminal.saldo = sc.nextDouble();
        sc.nextLine();

        String mensagem = "Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco.";
        mensagem += "Sua agência é " + contaTerminal.agencia + ", conta número " + contaTerminal.numConta;
        mensagem += " e seu saldo é de " + contaTerminal.saldo;

        System.out.println(mensagem);

    }
}
