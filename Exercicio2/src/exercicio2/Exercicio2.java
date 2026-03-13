
package exercicio2;

public class Exercicio2 {

   
    public static void main(String[] args) {
         Gerente gerente = new Gerente();

        gerente.setNome("Vitor");
        gerente.setSalario(5000.0);
        gerente.setDepartamento("Financeiro");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
    }
}
