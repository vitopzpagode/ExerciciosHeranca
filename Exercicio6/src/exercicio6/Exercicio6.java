
package exercicio6;

public class Exercicio6 {


    public static void main(String[] args) {
                ProdutoEletronico eletronico = new ProdutoEletronico();
        eletronico.setNome("Televisão");
        eletronico.setPreco(2500.00);
        eletronico.setVoltagem(220);

        ProdutoAlimenticio alimento = new ProdutoAlimenticio();
        alimento.setNome("Chocolate");
        alimento.setPreco(8.50);
        alimento.setDataValidade("10/12/2026");

        System.out.println("PRODUTO ELETRÔNICO");
        System.out.println("Nome: " + eletronico.getNome());
        System.out.println("Preço: " + eletronico.getPreco());
        System.out.println("Voltagem: " + eletronico.getVoltagem());

        System.out.println();

        System.out.println("PRODUTO ALIMENTÍCIO");
        System.out.println("Nome: " + alimento.getNome());
        System.out.println("Preço: " + alimento.getPreco());
        System.out.println("Data de Validade: " + alimento.getDataValidade());
    }
}
