import java.util.Scanner;

public class Contador 
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        Integer parametroUm = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o segundo número: ");
        Integer parametroDois = sc.nextInt();
        sc.nextLine();

        try
        {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e)
        {
            System.out.println("O segundo paraâmetro deve ser maior que o primeiro!");
        }

        sc.close();
    }

    static void contar (Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException
    {
        if (parametroUm > parametroDois)
        {
            throw new ParametrosInvalidosException();
        }

        Integer contagem = 1;
        for (int i = parametroUm; i <= parametroDois; i++)
        {
            System.out.println("Imprimindo número (" + contagem + ") " + i);
            contagem++;
        }
    }
}
