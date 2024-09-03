
package com.example.rest.repository;

import com.example.rest.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Long>{
    
}
