public class Fila {
    
    private NoFila refNoEntradaFila;

    public Fila(){
        refNoEntradaFila = null;
    }

    public Boolean isEmpty(){
        return (refNoEntradaFila == null);
    }

    public void enqueue(NoFila novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public NoFila first(){
        if (!isEmpty()){
            NoFila primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }
                else
                    break;
            }
            return primeiroNo;
        }
        else
            return null;
    }

    public NoFila dequeue(){
        if (!isEmpty()){
            NoFila primeiroNo = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;
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
            return primeiroNo;
        }
        else
            return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAux = refNoEntradaFila;

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
