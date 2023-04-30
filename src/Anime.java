public class Anime extends midia{

    Anime(String nome, String autor, String estudio, int temps, int maxEps, int duracaoEP){
        super(nome, autor, estudio);
    }

    public int gettemps() {
        return super.getTemps();
    }

    public void settemps(int temps) {
        super.setTemps(temps);
    }

    public int getMaxEps() {
        return super.getMaxEps();
    }

    public void setMaxEps(int maxEps) {
        super.setMaxEps(maxEps);
    }

    public int getDuracaoEP() {
        return super.getDuracaoEP();
    }

    public void setDuracaoEP(int duracaoEP) {
        super.setDuracaoEP(duracaoEP);
    }

    public String getStatusVisto() {
        return super.getStatusVisto();
    }

    public void setStatusVisto(String statusVisto) {
        super.setStatusVisto(statusVisto);
    }

    public Elenco getElenco() {
        return super.getElenco();
    }

    public void setElenco(Elenco elenco) {
        super.setElenco(elenco);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
