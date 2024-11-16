public class App {
    public static void main(String[] args) throws Exception {
        
        IPhone iPhone = new IPhone();

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("uol.com.br");
        iPhone.atualizarPagina();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Travessia");

        iPhone.ligar("(99)9 9999-9999");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

    }
}
