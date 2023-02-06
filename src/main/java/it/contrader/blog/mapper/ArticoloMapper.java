package it.contrader.blog.mapper;

import it.contrader.blog.dto.ArticoloDTO;
import it.contrader.blog.entity.Articolo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticoloMapper {
    ArticoloMapper USERINSTANCE = Mappers.getMapper(ArticoloMapper.class);
    Articolo toEntity(ArticoloDTO articoloDTO);
    ArticoloDTO toDto(Articolo articolo);
    List<Articolo>toEntityList(Iterable<ArticoloDTO>articoloDTOS);
    List<ArticoloDTO>toDtoList(Iterable<Articolo>articolos);
}