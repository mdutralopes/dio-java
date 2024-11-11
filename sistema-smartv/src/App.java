public class App {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println(smartTv.ligada);
       System.out.println(smartTv.canal);
       System.out.println(smartTv.volume);

       smartTv.ligar();
       smartTv.marca = args[0];
       System.out.println(smartTv.ligada);
       System.out.println(smartTv.marca);
    }
}
