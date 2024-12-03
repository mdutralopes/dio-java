public class App {
    public static void main(String[] args) throws Exception {
        
        // Nós com Generics
        System.out.println("Nós==============================");
        No<String> no1 = new No<String>("Conteúdo nó 1");

        No<String> no2 = new No<String>("Conteúdo nó 2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<String>("Conteúdo nó 3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<String>("Conteúdo nó 4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());

        // Pilha
        System.out.println("Pilhas =============================");
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No<Integer>(1));
        minhaPilha.push(new No<Integer>(2));
        minhaPilha.push(new No<Integer>(3));
        minhaPilha.push(new No<Integer>(4));
        minhaPilha.push(new No<Integer>(5));
        minhaPilha.push(new No<Integer>(6));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        // Fila
        Fila minhaFila = new Fila();

        // minhaFila.enqueue(new NoFila("Primeiro"));
        // minhaFila.enqueue(new NoFila("Segundo"));
        // minhaFila.enqueue(new NoFila("Terceiro"));
        // minhaFila.enqueue(new NoFila("Quarto"));

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("Último");
        System.out.println(minhaFila);
    }
}
