import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {
        
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6, 0d));
        System.out.println(notas.toString());

        System.out.println("A nota 6 está no set? " + notas.contains(6d));
        System.out.println("A menor nota é: " + Collections.min(notas));
        System.out.println("A maior nota é: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos itens da lista é : " + soma);
        System.out.println("A média das notas é: " + soma / notas.size());

        notas.remove(0d);
        System.out.println(notas.toString());

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7d){
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());


    }
}
