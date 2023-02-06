package it.contrader.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idUser;
    @Column(unique = true)
    public String username;
    public String usertype;
    public String password;
    public int eta;
    public Long userID;

}
