public class IPhone implements IPod, Navigator, Telefone{
    public void tocar()
    {
        System.out.println("TOCANDO IPOD");
    }

    public void pausar()
    {
        System.out.println("PAUSANDO IPOD");
    }

    public void selecionarMusica(String musica)
    {
        System.out.println("SELECIONANDO MÚSICA IPOD " + musica);
    }

    public void ligar(String numero)
    {
        System.out.println("LIGANDO TELEFONE: " + numero);
    }

    public void atender()
    {
        System.out.println("ATENDENDO TELEFONE ");
    }

    public void iniciarCorreioVoz()
    {
        System.out.println("INICIANDO CORREIO VOZ NO TELEFONE");
    }

    public void exibirPagina(String url)
    {
        System.out.println("EXIBINDO PÁGINA NO NAVIGATOR: " + url);
    }

    public void adicionarNovaAba()
    {
        System.out.println("ADICIONANDO NOVA PÁGINA NO NAVIGATOR");
    }

    public void atualizarPagina()
    {
        System.out.println("ATUALIZANDO PÁGINA NO NAVIGATOR");
    }
}
