# scanner-lexico-de-codigo
## Feito com ❤ por [murielsouza](https://github.com/murielsouza/), [ViniciusCavichioli](https://github.com/ViniciusCavichioli/) e [José Henrique](https://github.com/jhcb007/).

#### Disciplina: [0715 - Compiladores / 2019.2](http://ulbra-to.br/cursos/Ciencia-da-Computacao/2019/2/turmas/0715) 
#### Professor: Mestre [Jackson Gomes](https://github.com/jacksongomesbr)
#### Centro Universitário Luterano de Palmas - CEULP/ULBRA

Esse repositório contém um analisador léxico com as seguintes caracteristicas: 

      palavras reservadas: while, do
      operadores: <, =, +
      terminador: ;
      identificadores: i, j
      constantes: sequência de números
      números: 0 ... 9

Por meio da entrada de um arquivo texto (qualquer nome e qualquer extensão), o scanner processa (analisa) e gera na saída um arquivo JSON, contendo a tabela de tokens, a tabela de símbolos e um possível erro encontrado durante a análise.

Esse repositório foi construído utilizando a linguagem de programação JAVA e a biblioteca [GSON 2.8.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.0)

Agosto/2019
