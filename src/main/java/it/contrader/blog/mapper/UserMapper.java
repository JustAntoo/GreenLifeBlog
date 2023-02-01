package it.contrader.blog.mapper;

import it.contrader.blog.dto.UserDTO;
import it.contrader.blog.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper USERINSTANCE = Mappers.getMapper(UserMapper.class);
    User toEntity (UserDTO userDTO);
    UserDTO toDto (User user);
    List<User>toEntityList(Iterable<UserDTO>userDTOS);
    List<UserDTO>toDtoList(Iterable<User>users);
}
