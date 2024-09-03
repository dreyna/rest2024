
package com.example.rest.service;

import com.example.rest.entity.Libro;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author USER
 */
public interface LibroService {
    Libro create(Libro a);
    Libro update(Libro a);
    void delete(Long id);
    Optional<Libro> read(Long id);
    List<Libro> readAll();
}
