public class SmartTv {
    Boolean ligada = false;
    Integer canal = 1;
    Integer volume = 25;

    public void ligar()
    {
        ligada = true;
    }

    public void desligar()
    {
        ligada = false;
    }

    public void aumentarVolume()
    {
        volume++;
    }

    public void diminuirVolume()
    {
        volume--;
    }
}