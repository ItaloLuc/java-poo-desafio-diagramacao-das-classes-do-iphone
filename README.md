# DIO - Trilha POO Java
Site oficial: [www.dio.me](http://www.dio.me)

## Autor do Desafio e Repositório Original
- Autor: [Gleyson Sampaio](https://github.com/glysns)
- Repositório Original: [Desafio Diagramação de Classes do Iphone](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

## Desafio de Projeto
O desafio consiste em criar a diagramação UML e modelar um iPhone, inspirado no vídeo de lançamento do primeiro iPhone, onde Steve Jobs destaca que o dispositivo combina funcionalidades de um reprodutor musical, um aparelho telefônico e um navegador para acesso à internet. Utilizando conceitos de Programação Orientada a Objetos (POO), você deve diagramar as interfaces que representam as seguintes funcionalidades:

- **Reprodutor Musical:** tocar, pausar, selecionarMusica
- **Aparelho Telefônico:** ligar, atender, iniciarCorreioVoz
- **Navegador:** exibirPagina, adicionarNovaAba, atualizarPagina

Além disso, você deve criar a classe que representa o iPhone.

## Diagrama UML
Abaixo está o diagrama UML que representa o iPhone e suas funcionalidades:

```mermaid
classDiagram
    class IPHONE {
    }

    class ReprodutorMusical {
        +tocar(): void
        +pausar(): void
        +selecionarMusica(): void
    }

    class AparelhoTelefonico {
        +ligar(): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        +exibirPagina(): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    IPHONE <|.. ReprodutorMusical
    IPHONE <|.. AparelhoTelefonico
    IPHONE <|.. NavegadorInternet
