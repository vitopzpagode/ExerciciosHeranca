
package exercicio1;


public class Exercicio1 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("João");
        aluno.setIdade(20);
        aluno.setMatricula("2024001");
        aluno.setCurso("Informática");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
    }
}
