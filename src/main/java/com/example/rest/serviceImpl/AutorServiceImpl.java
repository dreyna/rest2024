
package com.example.rest.serviceImpl;

import com.example.rest.entity.Autor;
import com.example.rest.repository.AutorRepository;
import com.example.rest.service.AutorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class AutorServiceImpl implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    @Override
    public Autor create(Autor a) {
        return autorRepository.save(a);
    }

    @Override
    public Autor update(Autor a) {
        return autorRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        autorRepository.deleteById(id);
    }

    @Override
    public Optional<Autor> read(Long id) {
        return autorRepository.findById(id);
    }

    @Override
    public List<Autor> readAll() {
        return autorRepository.findAll();
    }
    
}
