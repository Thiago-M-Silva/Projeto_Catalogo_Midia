package com.example.catalogo.Usuario;

import com.example.catalogo.Serie.Serie;

public record UsuarioResponseDTO(Long id, String nome, String tipo) {
    public UsuarioResponseDTO(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getTipo());
    }
}
