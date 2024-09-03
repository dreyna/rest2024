
package com.example.rest.service;

import com.example.rest.entity.Editorial;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author USER
 */
public interface EditorialService {
    Editorial create(Editorial a);
    Editorial update(Editorial a);
    void delete(Long id);
    Optional<Editorial> read(Long id);
    List<Editorial> readAll();
}
