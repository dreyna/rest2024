
package com.example.rest.repository;

import com.example.rest.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}