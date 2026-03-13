
package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("O Pequeno Príncipe");
        livro.setAnoPublicacao(1943);
        livro.setAutor("Antoine de Saint-Exupéry");

        Revista revista = new Revista();
        revista.setTitulo("Revista Científica");
        revista.setAnoPublicacao(2026);
        revista.setEdicao(15);

        livro.exibirDados();
        revista.exibirDados();
    }
}
