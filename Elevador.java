public class Elevador {

    private int andarAtual = 0;
    private boolean portaAberta = true;

    // andar atual não pode ser menor que 0
    // andar atual não pode ser maior que 15
    // mensagem de aviso caso o andar atual e o andar desejado sejam iguais
    public void escolherAndar(int andarDesejado) {
        // verificar se a porta tá aberta
        if (portaAberta) {
            System.out.println("Feche a porta antes de utilizar o elevador!");
        } else {
            // o andar desejado é válido?
            if (andarDesejado >= 0 && andarDesejado <= 15) {
                if (andarAtual == andarDesejado) {
                    System.out.println("Você já está nesse andar!");
                } else if (andarDesejado > andarAtual) {
                    System.out.println("Você subiu para o andar " + andarDesejado);
                } else {
                    System.out.println("Você desceu para o andar " + andarDesejado);
                }
                andarAtual = andarDesejado;
            } else {
                System.out.println("Andar inválido!");
            }
        }
    }

    public void abrirPorta() {
        if (portaAberta) {
            System.out.println("A porta do elevador já está aberta!");
        } else {
            portaAberta = true;
            System.out.println("A porta do elevador abriu");
        }
    }

    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("A porta do elevador fechou");
        } else {
            System.out.println("A porta do elevador já está fechada!");
        }
    }

    public void imprimirInfo() {
        System.out.println("A porta do elevador está " + (portaAberta ? "ABERTA" : "FECHADA"));
        System.out.println("O elevador está no andar " + andarAtual);
    }
}
