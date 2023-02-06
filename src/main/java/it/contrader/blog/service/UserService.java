package it.contrader.blog.service;

import it.contrader.blog.dao.UserRepository;
import it.contrader.blog.dto.UserDTO;
import it.contrader.blog.entity.User;
import it.contrader.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

@Autowired
    private UserMapper userMapper;
@Autowired
private UserRepository userRepository;

public UserDTO findByUsernameAndPassword(String username, String password){
return userMapper.toDto(userRepository.findByUsernameAndPassword(username,password));
}
public UserDTO insert(UserDTO userDTO){
    return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
}
public List<UserDTO> getAll(){
    return userMapper.toDtoList(userRepository.findAll());
}

public UserDTO read(Long id){
    return userMapper.toDto(userRepository.findById(id).get());
}
public UserDTO update(Long id, UserDTO userDTO) throws Exception {
    if (userDTO.idUser == id){
        User newUser = userMapper.toEntity(userDTO);
        return userMapper.toDto(userRepository.save(newUser));
    }
    else {
        throw new Exception("utente non trovato");
    }
}
public void delete(Long id){
    userRepository.deleteById(id);
}




}
