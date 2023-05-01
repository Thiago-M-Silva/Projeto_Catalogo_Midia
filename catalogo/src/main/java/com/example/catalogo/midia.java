import java.sql.Date;
public abstract class midia {
    private String nome;
    private String descrição;
    private String autor;
    private String estudio; //estudio proprietário ou editora
    private String status;
    private String disponibilidade; //onde a midia pode ser econtrada
    private String tipo; //anime, serie, filme...
    private Date mesAno;
    private int temps;
    private int maxEps;
    private int duracaoEP;
    private String statusVisto; //se o usuario esta assistindo ou ñ ou se pretende ver
    private Elenco elenco; //lista de dubladores

    midia(String nome, String autor, String estudio){
        this.nome = nome;
        this.autor = autor;
        this.estudio = estudio;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getMesAno() {
        return mesAno;
    }
    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }
    
    @Override
    public String toString() {
        return "midia [nome=" + nome + ", descrição=" + descrição + ", autor=" + autor + ", estudio=" + estudio
                + ", status=" + status + ", tipo=" + tipo + ", mesAno=" + mesAno + "]";
    }
    
}
