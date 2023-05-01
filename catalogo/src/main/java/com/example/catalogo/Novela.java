public class Novela extends midia{
    private int maxEps;
    private int duracaoEP;
    private String statusVisto; //se o usuario esta assistindo ou ñ ou se pretende ver
    private Elenco elenco; //lista de dubladores

    Novela(String nome, String autor, String estudio, int maxEps, int duracaoEP){
        super(nome, autor, estudio);
        this.maxEps = maxEps;
        this.duracaoEP = duracaoEP;
    }

    public int getMaxEps() {
        return maxEps;
    }

    public void setMaxEps(int maxEps) {
        this.maxEps = maxEps;
    }

    public int getDuracaoEP() {
        return duracaoEP;
    }

    public void setDuracaoEP(int duracaoEP) {
        this.duracaoEP = duracaoEP;
    }

    public String getStatusVisto() {
        return statusVisto;
    }

    public void setStatusVisto(String statusVisto) {
        this.statusVisto = statusVisto;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        return super.toString() + "Anime [maxEps=" + maxEps + ", duracaoEP=" + duracaoEP + "]";
    }
}
