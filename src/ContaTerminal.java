import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome?");
        String nome = scan.next();

        System.out.println("Qual a sua agencia bancaria?");
        String agencia = scan.next();

        System.out.println("Qual seu numero de banco?");
        Integer numero = scan.nextInt();

        System.out.println("Qual seu saldo");
        float saldo = scan.nextFloat();

        System.out.println( "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque");
    }
}
