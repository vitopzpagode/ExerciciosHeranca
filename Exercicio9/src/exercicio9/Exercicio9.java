
package exercicio9;


public class Exercicio9 {

    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        aviao.setCapacidade(180);
        aviao.setVelocidade(850.0);
        aviao.setCompanhiaAerea("Latam");

        Onibus onibus = new Onibus();
        onibus.setCapacidade(50);
        onibus.setVelocidade(80.0);
        onibus.setNumeroLinha("101A");

        System.out.println("AVIÃO");
        System.out.println("Capacidade: " + aviao.getCapacidade());
        System.out.println("Velocidade: " + aviao.getVelocidade() + " km/h");
        System.out.println("Companhia aérea: " + aviao.getCompanhiaAerea());

        System.out.println();

        System.out.println("ÔNIBUS");
        System.out.println("Capacidade: " + onibus.getCapacidade());
        System.out.println("Velocidade: " + onibus.getVelocidade() + " km/h");
        System.out.println("Número da linha: " + onibus.getNumeroLinha());
    }
}
