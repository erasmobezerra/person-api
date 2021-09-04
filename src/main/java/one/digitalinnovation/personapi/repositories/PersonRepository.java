package one.digitalinnovation.personapi.repositories;

import one.digitalinnovation.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

/*
        Spring Data Jpa

        O projeto Spring Data Jpa facilita a implementação do padrão Repository
 através de AOP (Aspect Oriented Programming - programação orientada a aspectos).


        O projeto Spring Data JPA, embora não seja um framework ORM, foi desenvolvido
    com base no padrão JPA 2 para trabalhar com qualquer framework que siga tal
    especificação. Ele é responsável pela implementação dos repositórios (camada
    de persistência de dados), oferecendo funcionalidades sofisticadas e comuns à
    maioria dos métodos de acesso a banco de dados. Ao programador, se abstrai a
    necessidade de criar classes concretas para os repositórios, sendo necessário
    apenas criar uma interface específica para cada classe de entidade, e nelas,
    estender a interface JpaRepository. Ao herdar a interface JpaRepository, dois
    propósitos são preenchidos: no primeiro, uma variedade de métodos como save(),
    delete(), findAll(), entre outros, são fornecidos; e no segundo, o reconhecimento
    desta interface como um bean do Spring, o que é útil para a injeção de dependência.

 */
