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
        System.out.println("Fila ============================");
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new NoFila("Primeiro"));
        minhaFila.enqueue(new NoFila("Segundo"));
        minhaFila.enqueue(new NoFila("Terceiro"));
        minhaFila.enqueue(new NoFila("Quarto"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(new NoFila("Último"));
        System.out.println(minhaFila);

        // Lista encadeada
        System.out.println("Lista encadeada ==========================");
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<String>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(2);

        System.out.println(minhaListaEncadeada);

        // Lista duplamente encadeada
        System.out.println("Lista duplamente encadeada");
        ListaDuplamenteEncadeada<String> minhaListaDpEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDpEncadeada.add("c1");
        minhaListaDpEncadeada.add("c2");
        minhaListaDpEncadeada.add("c3");
        minhaListaDpEncadeada.add("c4");
        minhaListaDpEncadeada.add("c5");
        minhaListaDpEncadeada.add("c6");
        minhaListaDpEncadeada.add("c7");

        System.out.println(minhaListaDpEncadeada);

        minhaListaDpEncadeada.remove(3);
        minhaListaDpEncadeada.add(3, "99");

        System.out.println(minhaListaDpEncadeada);
        System.out.println(minhaListaDpEncadeada.get(3));

    }
}
