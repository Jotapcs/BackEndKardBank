package com.example.backendkardbank.Controller;

import com.example.backendkardbank.Model.User;
import com.example.backendkardbank.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * Method to return a list of clients
     * @return all clients
     */
    @GetMapping
    public List<User> obterTodos(){
        return userService.obterTodos();
    }


    /**
     * Method to add the user on the list
     * @param user that will be updated
     * @return the client that was added to the list
     */
    @PostMapping
    public User inserir(@RequestBody User user){
        return userService.inserir(user);
    }


    /**
     * Method to delete the client by Id
     * @param id of the client to be deleted
     */
    @DeleteMapping ("/{id}")
    public String excluir(@PathVariable Integer id){
        userService.excluir(id);
                return "Product with id:" + id + " was successfully deleted!";
    }


    /**
     * Method to update the client to the list
     * @param user that will be updated
     * @return the client after updating the list
     */
    @PutMapping("/{id}")
    public User atualizar(@RequestBody User user, @PathVariable Integer id){
            return userService.atualizar(id, user);
    }

}
