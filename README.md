# scanner-lexico-de-codigo
## Feito com ❤ por [murielsouza](https://github.com/murielsouza/), [ViniciusCavichioli](https://github.com/ViniciusCavichioli/) e [José Henrique](https://github.com/jhcb007/) para:

   * Disciplina: [0715 - Compiladores / 2019.2](http://ulbra-to.br/cursos/Ciencia-da-Computacao/2019/2/turmas/0715) 
   * Professor: [Msc. Jackson Gomes](https://github.com/jacksongomesbr)
   * Centro Universitário Luterano de Palmas - CEULP/ULBRA

# documentação
Essas bibliotecas (em azul) permitem executar a aplicação. Recomenda-se a instalação [Java SE Development Kit](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) em conjunto com algum ambiente de Desenvolvimento (IDE) que execute a linguagem JAVA.

[![Java Development Kit v.8.0](https://img.shields.io/badge/JDK-v.8%20Update%20211-green.svg)](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
[![GSON 2.8.0](https://img.shields.io/badge/GSON-v.2.8.0-blue.svg)](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.0)

**Por que usar esse repositório?**
### Vantagens

* É Simples e funcional,
* Tem interface gráfica,
* Permite adição de novas palavras reservadas ou identificadores via interface gráfica,
* Pode utilizar um código-fonte com diversas linhas (o código não precisa está em uma linha somente), 
* Gera os arquivos JSON e as tabelas (na interface-gráfica) durante sua execução,
* E o mais importante: FOI FEITO COM ❤.

Esse repositório contém um analisador léxico com as seguintes caracteristicas: 

      palavras reservadas: while, do
      operadores: <, =, +
      terminador: ;
      identificadores: i, j
      constantes: sequência de números
      números: 0 ... 9



Por meio da entrada de um arquivo texto (qualquer nome e qualquer extensão), o scanner processa (analisa) e gera na saída um arquivo JSON, contendo a tabela de tokens, a tabela de símbolos e um possível erro encontrado durante a análise.

Entrada:

      while i < 100 do i = i + j;

Saídas:

Tabela de Tokens

|     Token      |        Identificação        | Tamanho |       Posição        |    
|----------------|-----------------------------|---------|----------------------|
|while           |palavra reservada            |5        |(0,0)                 |
|i               |[identificador, 1]           |1        |(0,6)                 |
|<               |operador                     |1        |(0,8)                 |
|100             |[constante, 2]               |3        |(0,10)                |
|do              |palavra reservada            |2        |(0,14)                |
|i               |[identificador, 1]           |1        |(0,17)                |
|=               |operador                     |1        |(0,19)                |
|i               |[identificador, 1]           |1        |(0,21)                |
|+               |operador                     |1        |(0,23)                |
|j               |[identificador, 3]           |1        |(0,25)                |
|;               |terminador                   |1        |(0,27)                |

Tabela de Símbolos:

|  Índice  |      Símbolo      |
|----------|-------------------|
|1         |i                  |
|2         |100                |
|3         |j                  |
