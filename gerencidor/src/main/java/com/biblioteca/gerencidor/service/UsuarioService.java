package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Usuario;
import com.biblioteca.gerencidor.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario insertUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
