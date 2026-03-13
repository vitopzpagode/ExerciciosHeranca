
package exercicio3;

public class Cachorro {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

