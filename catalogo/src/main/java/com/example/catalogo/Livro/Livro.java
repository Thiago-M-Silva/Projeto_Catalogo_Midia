package com.example.catalogo.Livro;

import com.example.catalogo.Midia.midia;

public class Livro extends midia {
    private int paginas; //numero de paginas

    public Livro(String nome, String autor, String editora, int paginas){
        super(nome, autor, editora);
        this.paginas = paginas;
    }

    public Livro(LivroRequestDTO data) {
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
