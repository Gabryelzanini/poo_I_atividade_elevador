public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.imprimirInfo();
        elevador.fecharPorta();
        elevador.escolherAndar(1);

        elevador.escolherAndar(14);

        elevador.escolherAndar(5);

        elevador.escolherAndar(-5);

        elevador.escolherAndar(16);

        elevador.escolherAndar(0);

        elevador.escolherAndar(6);

        elevador.imprimirInfo();

        elevador.abrirPorta();

        elevador.escolherAndar(2);
    }
}