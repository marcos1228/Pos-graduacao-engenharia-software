# Vetores e Matrizes

## Introdução

A maioria dos programas (para não se dizer todos) manipulam dados de diferentes tipos, sejam números, texto ou valores booleanos. Todos estes dados ficam armazenados em memória. No código-fonte, nos referenciamos a estas posições de memória através do conceito de variáveis.

Como já é do seu conhecimento, uma variável é um espaço em memória onde armazenamos dados temporários para que, posteriormente, possamos acessá-lo. Se considerarmos a memória como uma rua, cada espaço onde armazenamos os dados são as casas.

Nesta aula, avançaremos nossos estudos para conhecer um tipo de armazenamento de dados em memória um pouco diferente do que foi visto até então. Começaremos a estudar o conceito de vetores e matrizes. Vamos compreender como estas estruturas armazenam e organizam uma coleção de tipos de dados semelhantes.

## Objetivos da aula

- Compreender o conceito de estrutura de dados.
- Reconhecer os tipos de estruturas de dados e suas operações.
- Compreender o processo iterativo de manipulação de dados.
- Diferenciar vetores e matrizes.

## Resumo

Um vetor ou array é uma coleção de um ou mais valores do mesmo tipo. Cada valor é chamado de elemento do array. Os elementos compartilham o mesmo nome de variável, mas cada elemento tem seu próprio número de índice exclusivo (também conhecido como subscrito). Um array pode ser de qualquer tipo, por exemplo: `int`, `float`, `double` (MANZANO, 2016).

Em uma rua, se uma casa representa uma posição de memória onde guardamos um único valor, teremos agora na rua um prédio com `n` andares, onde temos o térreo (0), o primeiro andar (1), o segundo andar (2), e assim por diante até o andar `n-1`. Ou seja, se o prédio tiver 10 andares (este é o valor de `n`), o primeiro será o andar 0 (zero) e o último o andar 9 (nove).

### Exemplo de variáveis simples e compostas

Suponha que você precisa entregar uma encomenda na `casa26`. Então, basta fazer:

```java
casa26 = "encomenda";
```

Agora, suponha que você precisa entregar uma encomenda no quarto andar do prédio. Você deve fazer:

```java
predio[4] = "encomenda";
```

Aqui, a variável `predio` na posição `4` recebe o valor "encomenda".

### Uso de vetores em um sistema escolar

Considere um sistema de boletim escolar onde a professora precisa armazenar quatro notas trimestrais dos alunos Carlos e Bia. Podemos fazer isso de duas formas:

1. Criar quatro variáveis de nota para a Bia e quatro variáveis de nota para o Carlos.
2. Criar um vetor de notas para cada aluno, o que é mais eficiente.

A seguir, veja um exemplo de código Java manipulando as notas de Carlos:

```java
double[] notasCarlos = new double[4];
double media;

notasCarlos[0] = 4;
notasCarlos[1] = 8;
notasCarlos[2] = 6;
notasCarlos[3] = 8;

media = (notasCarlos[0] + notasCarlos[1] + notasCarlos[2] + notasCarlos[3]) / 4;

System.out.println("A média de notas do Carlos é: " + media);
```

### Declarando e inicializando um vetor diretamente

Outra maneira de declarar um vetor já atribuindo os valores é:

```java
double[] notasCarlos = {4, 8, 6, 8};
double media;

media = (notasCarlos[0] + notasCarlos[1] + notasCarlos[2] + notasCarlos[3]) / 4;

System.out.println("A média de notas do Carlos é: " + media);
```

Este código tem o mesmo efeito do anterior, mas economiza algumas linhas de código.

## Percorrendo um vetor

Agora considere um array com a idade de 10 alunos. Para exibir todos os valores armazenados neste vetor, temos duas opções:

1. Imprimir posição por posição (não recomendável para vetores grandes).
2. Utilizar uma estrutura de repetição para percorrer o vetor.

### Exemplo de impressão sequencial (não recomendável para grandes vetores)

```java
System.out.println("Idade: " + idade[0]);
System.out.println("Idade: " + idade[1]);
System.out.println("Idade: " + idade[2]);
System.out.println("Idade: " + idade[3]);
System.out.println("Idade: " + idade[4]);
```

### Exemplo de uso de estrutura de repetição (for)

Uma abordagem mais eficiente é utilizar um `for`:

```java
for (int i = 0; i < idade.length; i++) {
    System.out.println("Idade: " + idade[i]);
}
```

Dessa forma, podemos imprimir todas as idades sem precisar escrever múltiplas linhas de código manualmente.

