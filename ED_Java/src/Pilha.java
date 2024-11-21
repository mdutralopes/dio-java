public class Pilha {
  
    private No<Integer> refNoEntradaPilha;

    public Pilha() {
        refNoEntradaPilha = null;
    }

    public Boolean isEmpty(){
        return (refNoEntradaPilha == null);
    }

    public No<Integer> top(){
        return refNoEntradaPilha;
    }

    public void push(No<Integer> novoNo){
        No <Integer> refAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximoNo(refAux);
    }

    public No<Integer> pop(){
        if (!isEmpty()){
            No<Integer> noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProximoNo();
            return noPoped;
        }
        else{
            return null;
        }
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno += "Pilha\n";
        stringRetorno += "----------------\n";

        No<Integer> noAux = refNoEntradaPilha;

        while(true){
            if (noAux != null){
                stringRetorno += "[Dado = " + noAux.getConteudo() + "]\n";
                noAux = noAux.getProximoNo();
            }
            else
                break;
        }
        stringRetorno += "----------------\n";
        return stringRetorno;
    }

    
}
