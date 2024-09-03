
package com.example.rest.service;

import com.example.rest.entity.Autor;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author USER
 */
public interface AutorService {
    Autor create(Autor a);
    Autor update(Autor a);
    void delete(Long id);
    Optional<Autor> read(Long id);
    List<Autor> readAll();
            
}
