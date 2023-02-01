package it.contrader.blog.dao;

import it.contrader.blog.entity.Articolo;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ArticoloRepository extends CrudRepository<Articolo, Long> {
    Articolo findByNomeArticolo(String nomeArticolo);

}
