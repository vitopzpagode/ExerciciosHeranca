
package exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
          Professor professor = new Professor();
        professor.setNome("Vitor");
        professor.setCpf("123.456.789-00");
        professor.setDisciplina("Matemática");

        Aluno aluno = new Aluno();
        aluno.setNome("Julia");
        aluno.setCpf("987.654.321-00");
        aluno.setMatricula("2024002");

        System.out.println("PROFESSOR");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Disciplina: " + professor.getDisciplina());

        System.out.println();

        System.out.println("ALUNO");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
