
package com.example.rest.serviceImpl;

import com.example.rest.entity.Editorial;
import com.example.rest.repository.EditorialRepository;
import com.example.rest.service.EditorialService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class EditorialServiceImpl implements EditorialService{

    @Autowired
    private EditorialRepository editorialRepository;
    
    @Override
    public Editorial create(Editorial a) {
        return editorialRepository.save(a);
    }

    @Override
    public Editorial update(Editorial a) {
        return editorialRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        editorialRepository.deleteById(id);
    }

    @Override
    public Optional<Editorial> read(Long id) {
        return editorialRepository.findById(id);
    }

    @Override
    public List<Editorial> readAll() {
        return editorialRepository.findAll();
    }
    
}
