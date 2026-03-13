
package exercicio10;

public class Livro extends ItemBiblioteca {

 private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirDados() {
        System.out.println("LIVRO");
        super.exibirDados(); // chama o método da classe pai
        System.out.println("Autor: " + autor);
        System.out.println();
    }
}