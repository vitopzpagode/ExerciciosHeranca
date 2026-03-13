
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

        System.out.println("LIVRO");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        System.out.println("Autor: " + livro.getAutor());

        System.out.println();

        System.out.println("REVISTA");
        System.out.println("Título: " + revista.getTitulo());
        System.out.println("Ano de Publicação: " + revista.getAnoPublicacao());
        System.out.println("Edição: " + revista.getEdicao());
    }

    
   }
