import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 237.0;

        System.out.println("\n-------------- BANCO DIO --------------\n");
        System.out.println("Por favor, digite o número da Agência:");
        agencia = leitor.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        numero = leitor.nextInt();
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = leitor.next();
        leitor.close();
        
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.\n");

    }
}
