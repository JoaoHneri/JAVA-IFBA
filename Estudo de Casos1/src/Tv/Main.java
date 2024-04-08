package Tv;

public class Main {
    public static void main(String[] args) {
        Tv minhaTv = new Tv(32, "Sony", 110, 5);

        System.out.println("Informações da TV:");
        System.out.println(minhaTv.toString());

        minhaTv.ligarTv();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();
        System.out.println(minhaTv.toString());

        minhaTv.aumentarCanal();
        minhaTv.aumentarCanal();
        minhaTv.diminuirCanal();

        System.out.println(minhaTv.toString());

        minhaTv.desligarTv();
    }
}
