public class Fila<T> {
    
    private NoFila<T> refNoEntradaFila;

    public Fila(){
        refNoEntradaFila = null;
    }

    public Boolean isEmpty(){
        return (refNoEntradaFila == null);
    }

    public void enqueue(T obj){
        NoFila<T> novoNo = new NoFila<T>(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if (!isEmpty()){
            NoFila<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }
                else
                    break;
            }
            return (T)primeiroNo.getObject();
        }
        else
            return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            NoFila<T> primeiroNo = refNoEntradaFila;
            NoFila<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        else
            return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila<T> noAux = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while(true){
                stringRetorno += noAux.getObject() + " ---> ";
                if (noAux.getRefNo() != null){
                    noAux = noAux.getRefNo();
                }
                else
                    break;
            }
        }
        else
            stringRetorno = "null";
       
        return stringRetorno;
    }

    
}
