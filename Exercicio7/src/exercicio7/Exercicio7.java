
package exercicio7;

public class Exercicio7 {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumeroConta("12345-6");
        contaCorrente.setSaldo(1500.00);
        contaCorrente.setLimite(500.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumeroConta("98765-4");
        contaPoupanca.setSaldo(3000.00);
        contaPoupanca.setTaxaRendimento(0.05);

        System.out.println("CONTA CORRENTE");
        System.out.println("Número da conta: " + contaCorrente.getNumeroConta());
        System.out.println("Saldo: " + contaCorrente.getSaldo());
        System.out.println("Limite: " + contaCorrente.getLimite());

        System.out.println();

        System.out.println("CONTA POUPANÇA");
        System.out.println("Número da conta: " + contaPoupanca.getNumeroConta());
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
        System.out.println("Taxa de rendimento: " + contaPoupanca.getTaxaRendimento());
    }
}
