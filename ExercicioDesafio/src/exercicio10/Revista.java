
package exercicio10;

public class Revista extends ItemBiblioteca {

    private int edicao;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDados() {
        System.out.println("REVISTA");
        super.exibirDados(); // chama o método da classe pai
        System.out.println("Edição: " + edicao);
        System.out.println();
    }
}
