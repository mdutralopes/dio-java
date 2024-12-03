import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppLista {
    public static void main(String[] args) {
        List<Double> temps = new ArrayList<>();
        Double soma = 0.0;
        Double media = 0.0;

        temps.add(35.7);
        temps.add(32.4);
        temps.add(29.1);
        temps.add(27.3);
        temps.add(26.8);
        temps.add(22.8);

        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        Iterator<Double> tempsIterator = temps.iterator();
        while (tempsIterator.hasNext()){
            Double next = tempsIterator.next();
            soma += next;
        }

        media = soma / temps.size();

        System.out.println("Média: " + media);
        for (int i = 0; i < temps.size(); i++){
            if (temps.get(i) > media){
                System.out.println(meses[i] + " " + temps.get(i));
            }
        }        

    }
}
