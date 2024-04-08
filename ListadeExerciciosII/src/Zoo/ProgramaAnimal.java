package Zoo;

public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Leão", "15/05/2018", "Scar", 1001, "África");


        System.out.println("Informações do Animal:");
        meuAnimal.imprimirInformacoes();

        System.out.println("\n");
        meuAnimal.alterar("Leão", "15/05/2018", "Simba", 1002, "África do Sul");


        System.out.println("Informações atualizadas do Animal:");
        meuAnimal.imprimirInformacoes();
    }
}
