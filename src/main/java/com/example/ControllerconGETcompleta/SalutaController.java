package com.example.ControllerconGETcompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class SalutaController {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{provincia}")
    public User getUser(
            @PathVariable String provincia,
            @RequestParam(value = "nome") String nome
    ){
        User userToReturn = new User(nome,provincia);
        return userToReturn;
    }
}
