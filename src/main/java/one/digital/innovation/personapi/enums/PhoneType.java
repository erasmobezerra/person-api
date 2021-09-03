package one.digital.innovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // cria os getters da classe
@AllArgsConstructor // gera o construtor com todos os argumentos
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}

