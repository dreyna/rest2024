
package com.example.rest.serviceImpl;

import com.example.rest.entity.Libro;
import com.example.rest.repository.LibroRepository;
import com.example.rest.service.LibroService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class LibroServiceImpl implements LibroService{
    
    @Autowired
    private LibroRepository libroRepository;
    
    @Override
    public Libro create(Libro a) {
        return libroRepository.save(a);
    }

    @Override
    public Libro update(Libro a) {
        return libroRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        libroRepository.deleteById(id);
    }

    @Override
    public Optional<Libro> read(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    public List<Libro> readAll() {
        return libroRepository.findAll();
    }
    
}
