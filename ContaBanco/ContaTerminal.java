package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.print("Conta: ");
        int conta = scanner.nextInt();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");



    }

}
