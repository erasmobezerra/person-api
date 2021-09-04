package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


/*  DTO (Padrão Objeto de Transferência de Dados)

Padrão Objeto de Transferência de Dados (do inglês, Data transfer object design pattern, ou simplesmente DTO)
é um padrão de arquitetura de objetos que agregam e encapsulam dados para transferência.

Diferente do que ocorre com os objetos de negócio e os objetos de acesso a dados (DAO), o DTO não possui qualquer tipo
de comportamento. A sua função é obter e armazenar dados. Quando estamos trabalhando com uma interface remota, cada
chamada ao servidor pode custar muito tempo de processamento, a depender da quantidade de dados. Com o DTO, podemos
filtrar quais dados serão transmitidos e assim reduzir esse problema.

O DTO é bastante utilizado também quando não queremos expor todos os dados da nossa camada de persistência mas
precisamos exibir ao nosso cliente estes mesmos dados. Vamos focar nosso post nessa linha de raciocício.

 */

@Data // cria getters, setters, toString, equalsAndHashCode
@Builder // Cria uma classe interna Builder que permite criar um objeto de forma fluente, assim deixando o código mais simples e funcional,
@AllArgsConstructor // gera o construtor com todos os argumentos
@NoArgsConstructor // gera construtor padrão vazio @AllArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING) // Atributo Enumerador do Tipo String
    private PhoneType type;

    @NotEmpty // não permite valor nulo e além disso seu tamanho deve ser maior que zero.
    @Size(min = 13, max = 14) // O tamanho do elemento anotado deve estar entre os limites especificados (incluídos)
    private String number;
}
