
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(3);

        Gato gato = new Gato();
        gato.setNome("Mimi");
        gato.setIdade(2);

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
    

