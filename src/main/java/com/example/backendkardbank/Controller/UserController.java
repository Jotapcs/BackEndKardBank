package com.example.backendkardbank.Controller;

import com.example.backendkardbank.Model.User;
import com.example.backendkardbank.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<User> findAll(){
        return userService.findAll();
    }


    /**
     * Method that returns the client found by your ID
     * @param id of the client that will be found
     * @return a client if found
     */
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Integer id){
        return userService.findById(id);
    }


    /**
     * Method to add the user on the list
     * @param user that will be updated
     * @return the client that was added to the list
     */
    @PostMapping
    public User add(@RequestBody User user){
        return userService.add(user);
    }


    /**
     * Method to delete the client by Id
     * @param id of the client to be deleted
     */
    @DeleteMapping ("/{id}")
    public String delete(@PathVariable Integer id){
        userService.delete(id);
                return "Product with id:" + id + " was successfully deleted!";
    }


    /**
     * Method to update the client to the list
     * @param user that will be updated
     * @return the client after updating the list
     */
    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable Integer id){
            return userService.update(id, user);
    }

}
