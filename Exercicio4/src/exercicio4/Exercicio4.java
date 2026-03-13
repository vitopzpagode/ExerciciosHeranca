
package exercicio4;


public class Exercicio4 {

    public static void main(String[] args) {
         Carro carro = new Carro();
         carro.setMarca("Toyota");
         carro.setModelo("Corolla");
        carro.setAno(2022);
        carro.setNumeroPortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB500");
        moto.setAno(2021);
        moto.setCilindradas(500);

        System.out.println("CARRO");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Número de portas: " + carro.getNumeroPortas());

        System.out.println();

        System.out.println("MOTO");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
    

