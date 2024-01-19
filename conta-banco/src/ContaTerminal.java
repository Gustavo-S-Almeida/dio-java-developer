import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, insira o número da sua agência: ");
        String numeroAgencia = scanner.nextLine();        

        System.out.println("Por favor, insira seu número de conta: ");
        int numeroConta = scanner.nextInt();      

        System.out.println("Por favor, insira seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        }
}
