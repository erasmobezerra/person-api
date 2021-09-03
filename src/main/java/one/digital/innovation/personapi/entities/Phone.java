package one.digital.innovation.personapi.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digital.innovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data // cria getters, setters, toString, equalsAndHashCode
@Builder // Cria uma classe interna Builder que permite criar um objeto de forma fluente, assim deixando o código mais simples e funcional,
@AllArgsConstructor // gera o construtor com todos os argumentos
@NoArgsConstructor // gera construtor padrão vazio
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false, unique = true)
    private String number;
}
