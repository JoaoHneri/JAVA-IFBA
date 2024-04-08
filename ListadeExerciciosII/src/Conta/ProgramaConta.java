package Conta;

public class ProgramaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("João", "1234567", "123.456.789-00", 1000.0, 1234,  001);


        minhaConta.imprimirSaldo();

        minhaConta.editarConta("João", "1234567", "123.456.789-00", 1500.0, 1234, 001);


        minhaConta.imprimirSaldo();

        System.out.println(minhaConta.toString());
    }
}
