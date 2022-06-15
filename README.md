# Exercicio de implementação de API com Spring Boot

Neste exercicio, para fins de estudos pessoais, implementei uma API para suportar parte do funcionamento da casa do código: 
Seguindo as regras de negocio desse [repositório](https://github.com/zup-academy/nosso-cartao-documentacao/tree/master/treino-casa-do-codigo).


### 1 - Cadastro de novo Autor:
Todo autor possui:
- Id;
- Nome;
- Email;
- Descrição;
- Intante do cadastro;

#### Restrições:
- O instante não pode ser nulo;
- O email é obrigatório;
- O email tem que ter formato válido;
- O nome é obrigatório;
- A descrição é obrigatória e não pode passar de 400 caracteres;

#### Necessidades:
- O email do autor precisa ser único no sistema

#### Resultado esperado:
- Erro de validação no caso de email duplicado

### 2 - Cadastro de nova Categoria:
Toda Categoria possui:
- Id;
- Nome;

#### Restrições:
- O nome é obrigatório;
- O nome não pode ser duplicado;

### 3 - Criar um novo Livro:
Todo Livro possui:
- Um título;
- Um resumo do que vai ser encontrado no livro; 
- Preço do livro;
- Número de páginas;
- Isbn(identificador do livro);
- Data que ele deve entrar no ar(de publicação);
- Um livro pertence a uma categoria;
- Um livro é de um autor;

#### Restrições:
- Título é obrigatório;
- Título é único;
- Resumo é obrigatório e tem no máximo 500 caracteres;
- Preço é obrigatório;
- Número de páginas é obrigatória;
- Isbn é obrigatório, formato livre;
- Isbn é único;
- Data que vai entrar no ar precisa ser no futuro;
- A categoria não pode ser nula;
- O autor não pode ser nulo;

### Tecnologias:

- Java;
- Spring Boot;
- Spring MVC;
- Spring Data;
- Hibernate;
- mMySQL;
- SQL;

### Estutura do Banco de Dados

![](https://cdn.discordapp.com/attachments/927534793892171798/986705414236274708/casadocodigo.png)


### Observações:

A API também é capaz de retornar dados de cada entidade/tabela a partir dos nome ou do id.