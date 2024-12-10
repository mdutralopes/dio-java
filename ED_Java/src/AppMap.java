import java.util.HashMap;
import java.util.Map;

public class AppMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("Gol", 14.4);
        carrosPopulares.put("Uno", 15.6);
        carrosPopulares.put("Mobi", 16.1);
        carrosPopulares.put("HB20", 14.5);
        carrosPopulares.put("Kwid", 15.6);
        System.out.println(carrosPopulares.toString());

        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println(("A lista tem o modelo Tucson? " + carrosPopulares.containsKey(("Tucson"))));
        System.out.println(("A lista tem o modelo Uno? " + carrosPopulares.containsKey(("Uno"))));
        System.out.println("O consumo do Uno é: " + carrosPopulares.get("Uno"));
        System.out.println("Lista de modelos: " + carrosPopulares.keySet().toString());

    }
}
