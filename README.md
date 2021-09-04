#  Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot
##
Este projeto se trata de um sistema básico para o gerenciamento de pessoas e foi desenvolvido durante
no curso **Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot**, ministrado
pelo professor <a href="https://www.linkedin.com/in/rodrigopeleias/">Rodrigo Peleias</a>.

O projeto original implementado pelo professor você pode encontrar
<a href="https://github.com/rpeleias/personapi_digital_innovation_one">clicando aqui.</a>

##
Pré-requisitos necessários para a execução deste projeto:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Postman para testar serviços da API

##
Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço 
e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```

##
### Documentação pelo Swagger
Para documentar e testar os serviços RESTFULL por meio do envio de requisições HTTP e da análise do seu retorno, acesse:
```
http://localhost:8080/swagger-ui.html#/person-controller/
```

##
### Deploy no Heroku
* Acesse o projeto hospedado no Heroku:
```
https://person-apirestfull.herokuapp.com/api/v1/people
```

##
### Slides
[Neste link](https://drive.google.com/file/d/1crVPOVl6ok2HeYjh3fjQuGQn2lDZVHrn/view?usp=sharing), 
é possível encontrar os slides utilizados pelo professor Rodrigo Peleias como roteiro utilizado para o desenvolvimento da API Restfull.