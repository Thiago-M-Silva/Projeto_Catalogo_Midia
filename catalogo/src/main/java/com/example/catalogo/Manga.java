public class Manga extends midia{
    private int qtdCaps;
    private String status; //lancamento ou encerrado
    private String statusLido; //se o usuario esta lendo ou ñ ou se pretende ler

    Manga(String nome, String autor, String estudio, int qtdCaps, String status){
        super(nome, autor, estudio);
        this.status = status;
        this.qtdCaps = qtdCaps;
    }

    public int getQtdCaps() {
        return qtdCaps;
    }

    public void setQtdCaps(int qtdCaps) {
        this.qtdCaps = qtdCaps;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLido() {
        return statusLido;
    }

    public void setStatusLido(String statusLido) {
        this.statusLido = statusLido;
    }
}
