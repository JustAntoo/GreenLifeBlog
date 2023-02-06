package it.contrader.blog.controller;

import it.contrader.blog.dto.UserDTO;
import it.contrader.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/getall")
    public List<UserDTO>getAll(){return userService.getAll();}

    @DeleteMapping("/delete")
    public void deleteById(@RequestParam Long id){
       userService.delete(id);
    }

    @PostMapping("/insert")
    public UserDTO insert(  @RequestBody UserDTO userDTO){
        return userService.insert(userDTO);
    }
    @PutMapping("/update")
    public UserDTO update(@RequestParam Long id, @RequestBody UserDTO userDTO) throws Exception
    {
        return userService.update(id, userDTO);
    }
}
