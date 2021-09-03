package one.digital.innovation.personapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {
    @GetMapping("/person")
    public String getBook(){
        return "API Rest";
    }
}
