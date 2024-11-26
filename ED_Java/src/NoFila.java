public class NoFila<T> {
    
    private T object;
    private NoFila<T> refNo;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoFila<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(NoFila<T> refNo) {
        this.refNo = refNo;
    }

    public NoFila(){

    }
    
    public NoFila(T object) {
        this.object = object;
        this.refNo = null;
    }

    @Override
    public String toString() {
        return "NoFila [object=" + object + "]";
    }

    
}
