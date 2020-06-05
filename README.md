## :large_blue_circle: Sobre

O projeto consiste em um sistema de gerenciamento de usuários, com seus respectivos perfis e os seus cargos desempenhados dentro da empresa.
Esse repositório tem o objetivo de representar a API da aplicação. Através desse desafio pude aprender bastante sobre como desenvolver uma
aplicação utilizando Spring Boot, JPA, Hibernate e etc. É primeira vez que tenho contato com essas tecnologias para o desenvolvimento de uma API,
diferentemente das que eu estou acostumado, como por exemplo o NodeJS. Pretendo dar sequência no estudo dessas tecnologias que envolve o mundo do Spring Boot, pois vejo que é
muito aplicada no mercado.  

## :rocket: Tecnologias
-  Spring Boot
-  Docker
-  JPA
-  Hibernate
-  MySql
-  Etc

## :information_source: Como usar?

```bash
# Certifique que o java e o javac estão na versão 11.0.7.
# Além disso, é preciso que o mvn está com o java na versão 11.0.7.
$ mvn clean install

# Após isso, é necessário que tenha o docker e o docker-compose instalado na máquina para prosseguirmos.
# Docker na versão 19.03.6 e docker-compose na versão 1.17.1.
$ sudo docker-compose up --build --force-recreate

# Caso queira testar a API manualmente, é possível utilizar a plataforma Postman ou Insominia.

# GET -> http://localhost:8080/api/perfis
# POST -> http://localhost:8080/api/perfil
# PUT -> http://localhost:8080/api/perfil/:id
# DELETE -> http://localhost:8080/api/perfil/:id

# GET -> http://localhost:8080/api/cargos
# POST -> http://localhost:8080/api/cargo
# PUT -> http://localhost:8080/api/cargo/:id
# DELETE -> http://localhost:8080/api/cargo/:id

# GET -> http://localhost:8080/api/usuarios
# POST -> http://localhost:8080/api/usuario
# PUT -> http://localhost:8080/api/usuario/:id
# DELETE -> http://localhost:8080/api/usuario/:id
```

## :twisted_rightwards_arrows: Referências
-  https://www.youtube.com/watch?v=HR5Np1HmC7c&t=1335s
-  https://www.youtube.com/watch?v=OHn1jLHGptw
-  https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/

## :memo: Licença
Esse projeto está sob a licença MIT. Veja a [LICENÇA](./LICENSE) para mais informação.

---

Feito com ♥ por Vinicius Pimenta :wave: [Entrem em contato!](https://www.linkedin.com/in/vinicius-pimenta-195b04181/)
