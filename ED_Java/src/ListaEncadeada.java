public class ListaEncadeada<T>{

    NoListaEnc<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }
 
    public Boolean isEmpty(){
        return (referenciaEntrada == null);
    }

    public Integer size(){
        Integer tamanhoLIsta = 0;

        NoListaEnc<T> refAux = referenciaEntrada;
        
        while (true){
            if (refAux != null){
                tamanhoLIsta++;
                if (refAux.getProximoNo() != null){
                    refAux = refAux.getProximoNo();
                }
                else
                    break;
            }
            else
                break;
        }
        return tamanhoLIsta;
    }

    public void add(T conteudo){
        NoListaEnc<T> novoNo = new NoListaEnc<T>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        NoListaEnc<T> noAux = referenciaEntrada;
        for(int i = 0; i < this.size() - 1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);      
    }

    public T get(Integer index){
        return getNo(index).getConteudo();
    }

    private NoListaEnc<T> getNo(Integer index){
        validaIndice(index);
        NoListaEnc<T> noAuxiliar = referenciaEntrada;
        NoListaEnc<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(Integer index){
        validaIndice(index);
        NoListaEnc<T> noPivo = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        NoListaEnc<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    private void validaIndice(Integer index){
        if (index >= this.size() || index < 0){
            throw new IndexOutOfBoundsException("Náo existe conteúdo no índice!");
        }
    } 

    @Override
    public String toString() {
        String strRetorno = "";
        NoListaEnc<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}