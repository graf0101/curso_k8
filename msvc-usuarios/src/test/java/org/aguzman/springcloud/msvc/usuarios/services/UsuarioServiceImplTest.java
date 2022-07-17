package org.aguzman.springcloud.msvc.usuarios.services;

import org.aguzman.springcloud.msvc.usuarios.models.entity.Usuario;
import org.aguzman.springcloud.msvc.usuarios.repositories.UsuarioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class UsuarioServiceImplTest {
    @Mock
    UsuarioRepository usuarioRepository;
    @InjectMocks
    UsuarioServiceImpl usuarioServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        List<Usuario> result = usuarioServiceImpl.findAll();
        Assertions.assertEquals(List.of(new Usuario()), result);
    }

    @Test
    void testFindById() {
        Optional<Usuario> result = usuarioServiceImpl.findById(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testSave() {
        Usuario result = usuarioServiceImpl.save(new Usuario());
        Assertions.assertEquals(new Usuario(), result);
    }

    @Test
    void testDelete() {
        usuarioServiceImpl.delete(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme