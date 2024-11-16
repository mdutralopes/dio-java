import com.mlsoftdesign.clinical.model.Cliente;
import com.mlsoftdesign.clinical.model.EstadoCivil;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Marcos", "667.137.497-04");
        cliente.setEstadoCivil(EstadoCivil.CASADO);

        System.out.println((cliente.getNome() + " " + cliente.getCpf() + " " + cliente.getEstadoCivil().getDescricao()));
    }
}
