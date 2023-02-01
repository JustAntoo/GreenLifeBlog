package it.contrader.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticoloDTO {

    public Long id;
    public String nomeArticolo;
    public String bodyArticolo;
}
