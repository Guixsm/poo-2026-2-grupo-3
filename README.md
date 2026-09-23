# IF Quest

Projeto desenvolvido em equipe para a disciplina de **Programação Orientada a Objetos (POO)**.

O projeto foi desenvolvido com o objetivo de cumprir os requisitos propostos na atividade, envolvendo conceitos como:

* Encapsulamento
* Construtores
* Herança
* Abstração
* Polimorfismo
* Tratamento de exceções
* Interface gráfica

Como desafio extra, foi adicionada uma terceira subclasse, `Arqueiro`, além das classes `Mago` e `Guerreiro`.

# Integrantes

* Guilherme de Jesus Moura Miranda
* João Lucas Rocha de Sousa Pereira
* Ana Julia Pequeno da Silva

# Divisão das Partes

## Parte 1 — Personagem e Item

**Responsável:** João Lucas Rocha de Sousa Pereira

Desenvolvimento das classes:

* `Personagem`
* `Item`

Incluindo atributos, encapsulamento, getters, setters, construtores e validações.

## Parte 2 — Herança, Polimorfismo e Abstração

**Responsável:** Ana Julia Pequeno da Silva

Desenvolvimento das subclasses:

* `Mago`
* `Guerreiro`
* `Arqueiro`

Aplicação de herança, construtores com `super()`, sobrescrita de métodos e características específicas de cada classe.

A classe `Arqueiro` foi adicionada como um desafio extra ao projeto.

## Parte 3 — Exceções e Interface Gráfica

**Responsável:** Guilherme de Jesus Moura Miranda

Desenvolvimento de:

* `ForcaInsuficienteException`
* Tratamento de exceções utilizando `throw` e `try/catch`
* Interface gráfica `TelaCriacaoHeroi`, utilizando Java Swing

## Parte 4 — Integração, Testes e Documentação

**Responsáveis:** Todos os integrantes

A integração das partes, os testes do projeto, a organização final do código e a elaboração deste README foram realizados em conjunto pela equipe.

# Organização do Desenvolvimento

Cada integrante clonou o repositório em sua própria máquina e criou uma branch específica para sua parte do projeto.

O fluxo utilizado foi:

1. Clonagem do repositório.
2. Criação de uma branch `feature` para a parte de cada integrante.
3. Desenvolvimento da funcionalidade.
4. Adição e commit das alterações.
5. Criação de um Pull Request no GitHub.
6. Revisão do código por outro integrante da equipe.
7. Merge da branch na `main`.

Dessa forma, cada integrante teve sua contribuição identificada no histórico do projeto e as diferentes partes foram integradas gradualmente.

# Funcionalidades

O projeto contempla:

* Classe abstrata `Personagem`
* Classe `Item`
* Encapsulamento de atributos
* Construtores e validação de dados
* Herança
* Abstração
* Polimorfismo
* Coleção polimórfica utilizando `ArrayList<Personagem>`
* Sobrescrita de métodos
* Exceção personalizada `ForcaInsuficienteException`
* Uso de `throw` e `try/catch`
* Interface gráfica utilizando Java Swing
* Três subclasses:

  * `Mago`
  * `Guerreiro`
  * `Arqueiro`

# Como Executar

O projeto utiliza Java.

## 1. Compilar o projeto

Abra o terminal dentro da pasta do projeto e execute:

```bash
javac *.java
```

## 2. Executar a demonstração

Para executar a classe principal e visualizar a demonstração do polimorfismo, no terminal digite:

```bash
java Main
```

## 3. Executar a interface gráfica

Para abrir a tela de criação de herói:

```bash
java TelaCriacaoHeroi
```

# Uso Ético de Inteligência Artificial

Durante o desenvolvimento do projeto, ferramentas de Inteligência Artificial foram utilizadas como recurso de apoio ao aprendizado e à resolução de dúvidas relacionadas à programação.

A IA foi utilizada principalmente para:

* Esclarecer dúvidas sobre sintaxe e conceitos de Java;
* Auxiliar na compreensão de conceitos de POO, como herança, abstração, polimorfismo e encapsulamento;
* Auxiliar na compreensão e implementação de tratamento de exceções;
* Apoiar a identificação e correção de erros durante o desenvolvimento;
* Auxiliar na compreensão de conceitos relacionados ao Git e GitHub;
* Revisar e discutir possíveis soluções durante a implementação.

As decisões sobre a estrutura e implementação do projeto foram analisadas pelos integrantes da equipe, que testaram e verificaram o funcionamento do código.

A IA não foi utilizada como substituta da participação dos integrantes. O código foi estudado, discutido, adaptado e testado pela equipe, de forma que os integrantes fossem capazes de compreender e explicar as soluções utilizadas no projeto.
