import java.sql.Date;
import java.util.List;

public class Elenco {
    private String nome;
    private String funcao;
    private List<String> personagem;
    private int idade;
    private Date anoNasc;

    Elenco(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public List<String> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(List<String> personagem) {
        this.personagem = personagem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(Date anoNasc) {
        this.anoNasc = anoNasc;
    }

    
}
