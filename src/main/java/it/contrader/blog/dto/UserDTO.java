package it.contrader.blog.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    public Long idUser;
    public String username;
    public String usertype;
    public String password;
    public int eta;
    public Long userID;

}
