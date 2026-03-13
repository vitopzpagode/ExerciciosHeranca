
package exercicio8;


public class Exercicio8 {

    public static void main(String[] args) {
       Celular celular = new Celular();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S23");
        celular.setMemoria(128);

        Notebook notebook = new Notebook();
        notebook.setMarca("Dell");
        notebook.setModelo("Inspiron");
        notebook.setProcessador("Intel i7");

        System.out.println("CELULAR");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Memória: " + celular.getMemoria() + "GB");

        System.out.println();

        System.out.println("NOTEBOOK");
        System.out.println("Marca: " + notebook.getMarca());
        System.out.println("Modelo: " + notebook.getModelo());
        System.out.println("Processador: " + notebook.getProcessador());
    }
}