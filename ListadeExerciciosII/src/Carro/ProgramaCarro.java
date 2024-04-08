package Carro;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(1, "Toyota", "Prata", "Corolla", 2023, 4,
                "Gasolina", 5, 150000.0, true);
        System.out.println("Informações do Carro:");
        System.out.println(meuCarro.listar());

        meuCarro.alterar(1, "Toyota", "Preto", "Corolla", 2023, 4,
                "Gasolina", 5, 155000.0, true);

        System.out.println("\nInformações atualizadas do Carro:");
        System.out.println(meuCarro.listar());
    }
}
