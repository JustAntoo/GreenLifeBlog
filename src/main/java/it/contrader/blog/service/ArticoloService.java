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

    public ArticoloDTO read(String nomeArticolo) throws Exception {
        ArticoloDTO articoloDTO = articoloMapper.toDto(articoloRepository.findByNomeArticolo(nomeArticolo));
        if (articoloDTO == null){
            throw new Exception("Articolo non trovato");
        }
        return articoloDTO;
    }
    public ArticoloDTO update(ArticoloDTO articoloDTO){
            Articolo newArticolo = articoloMapper.toEntity(articoloDTO);
            return articoloMapper.toDto(articoloRepository.save(newArticolo));
    }
    public void delete(Long id){
        articoloRepository.deleteById(id);
    }
    //TODO
    public ArticoloDTO insert(ArticoloDTO articoloDTO){
        Articolo newArticolo = articoloMapper.toEntity(articoloDTO);
        return articoloMapper.toDto(articoloRepository.save(newArticolo));
    }

    public List<ArticoloDTO> getAll(){
        return articoloMapper.toDtoList(articoloRepository.findAll());
    }


}
