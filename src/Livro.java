public class Livro extends midia{
    private int paginas; //numero de paginas

    Livro(String nome, String autor, String editora, int paginas){
        super(nome, autor, editora);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return super.toString() + "Livro [paginas=" + paginas + "]";
    }

    
}
