
package com.example.rest.repository;

import com.example.rest.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
    
}
