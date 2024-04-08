package Funcionario;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "16/06/2004",
                "9876543", "987.654.321-00", "Rua IFBA, 07",
                "Feira de Santana, BA", 7000.0, "Desenvolvedor",
                "Pós-graduação", "0007", "Departamento de Desenvolvedores");


        funcionario.imprimirDados();
    }
}
