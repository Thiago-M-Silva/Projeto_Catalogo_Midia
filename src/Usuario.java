import java.util.List;

public class Usuario {
    private String nome;
    private Anime anime;
    private Filme filme;
    private Livro livro;
    private Manga manga;
    private Novela novela;
    private Serie serie;

    Usuario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<midia> listaMidia(String tipo){
        switch (tipo.toUpperCase()){
            case "A": 
                
            break;
            case "F": 
                
            break;
            case "L": 
                
            break;
            case "M": 
                
            break;
            case "N": 
                
            break;
            case "S": 
                
            break;
            default :
                System.out.println("Entrada invalida - ListaMIdia");
        }
        
        return null;
    }

    public void adicionarMidia(String tipo){

    }

    public void apagarMidia(String tipo){
        
    }

    public void compartilhar(String tipo){

    }

    public void listaFavoritos(String tipo){
        //teste github
    }

    public void listaNaoVistos(String tipo){
        //teste github
    }

    public void listaVistos(String tipo){
        //teste github
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", anime=" + anime + "]";
    }

    
}