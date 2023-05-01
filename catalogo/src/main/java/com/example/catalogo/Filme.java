public class Filme extends midia{
    private int duracao;
    
    Filme(String nome, String autor, String estudio, int duracao){
        super(nome, autor, estudio);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "Filme [duracao=" + duracao + "]";
    }

}
