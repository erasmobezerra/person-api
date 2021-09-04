package one.digitalinnovation.personapi.dto.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/*
    A anotação @Mapper indica ao MapStruct que a interface anotada será responsável pela declaração dos mapeamentos.
    Para fazer com que a interface seja gerenciada pelo Spring e possa ser feita a injeção de dependência nós
    utilizamos o argumento componentModel = “spring” dentro da anotação @Mapper
 */

@Mapper(componentModel = "spring")
public interface PersonMapper {

    // USUÁRIO <-->  PersonDTO <-->  Person  <--> Banco de Dados

    // Indica ao MapStruct que faça a conversão da string data para um formato padrão brasileiro, por exemplo.
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto); // Converte uma PersonDTO em uma Person

    PersonDTO toDTO(Person dto); // Converte uma Person em uma PersonDTO
}

/*  DTO (Padrão Objeto de Transferência de Dados)

Padrão Objeto de Transferência de Dados (do inglês, Data transfer object design pattern, ou simplesmente DTO)
é um padrão de arquitetura de objetos que agregam e encapsulam dados para transferência.

Diferente do que ocorre com os objetos de negócio (services) e os objetos de acesso a dados (DAO - Controller),
o DTO não possui qualquer tipo de comportamento. A sua função é obter e armazenar dados. Quando estamos trabalhando
com uma interface remota, cada  chamada ao servidor pode custar muito tempo de processamento, a depender da quantidade
de dados. Com o DTO, podemos  filtrar quais dados serão transmitidos e assim reduzir esse problema.

O DTO é bastante utilizado também quando não queremos expor todos os dados da nossa camada de persistência mas
precisamos exibir ao nosso cliente estes mesmos dados. Vamos focar nosso post nessa linha de raciocício.

 */