package Professor;

public class ProgramaProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("João Silva", "Doutorado", "Engenharia", 40, 5000.0);
        professor.alterar("João Henrique", "Bacharelado", "Sistemas de Informação", 40, 3000.0);
        professor.alterarDescricaoDisciplina("Matemática, Física, Programação");

        professor.imprimirDados();
    }
}
