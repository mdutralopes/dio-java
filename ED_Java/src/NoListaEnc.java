public class NoListaEnc<T> {
    
    private T conteudo;
    private NoListaEnc<T> proximoNo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaEnc<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaEnc<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoListaEnc(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public NoListaEnc() {
        this.proximoNo = null;
    }

    public NoListaEnc(T conteudo, NoListaEnc<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListaEnc [conteudo=" + conteudo + ", proximoNo=" + proximoNo + "]";
    }

    
}
