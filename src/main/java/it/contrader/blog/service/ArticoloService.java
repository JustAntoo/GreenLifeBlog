package it.contrader.blog.service;

import it.contrader.blog.dao.ArticoloRepository;
import it.contrader.blog.dto.ArticoloDTO;
import it.contrader.blog.entity.Articolo;
import it.contrader.blog.mapper.ArticoloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticoloService {

    @Autowired
    private ArticoloMapper articoloMapper;
    @Autowired
    private ArticoloRepository articoloRepository;

    private ArticoloDTO read(String nomeArticolo) throws Exception {
        ArticoloDTO articoloDTO = articoloMapper.toDto(articoloRepository.findByNomeArticolo(nomeArticolo));
        if (articoloDTO == null){
            throw new Exception("Articolo non trovato");
        }
        return articoloDTO;
    }
private ArticoloDTO update(ArticoloDTO articoloDTO){
        Articolo newArticolo = articoloMapper.toEntity(articoloDTO);
        return articoloMapper.toDto(articoloRepository.save(newArticolo));
}
    private void delete(Long id){
        articoloRepository.deleteById(id);
    }
    //TODO
    private ArticoloDTO insert(ArticoloDTO articoloDTO){
        Articolo newArticolo = articoloMapper.toEntity(articoloDTO);
        return articoloMapper.toDto(articoloRepository.save(newArticolo));
    }

    private List<ArticoloDTO> getAll(List<ArticoloDTO>articoloDTOS){
        return articoloMapper.toDtoList(articoloRepository.findAll());
    }
}
