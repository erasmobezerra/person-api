package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// EXCEÇÃO PERSONALIZADA

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {

    public PersonNotFoundException(Long id) {
        super(String.format("Person with ID %s not found!", id));
    }
}

/*

Um dos motivos para definir uma exceção personalizada é quando você ao distribuir uma aplicação desejar que qualquer
violação das regras de negócio da aplicação tenha um tratamento especial com uma mensagem específica ao usuário.

 */