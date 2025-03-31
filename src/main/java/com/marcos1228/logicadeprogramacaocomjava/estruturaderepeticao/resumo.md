# Estruturas de Repetição

## Introdução

Na programação de computadores, uma estrutura de repetição é uma sequência de instruções que é repetida continuamente até que uma determinada condição seja alcançada. Normalmente, um determinado processo é feito, como obter um item de dados e alterá-lo, e então alguma condição é verificada, como se um contador atingiu um número prescrito. Se não tiver, a próxima instrução na sequência é uma instrução para retornar à primeira instrução na sequência e repetir a sequência. Se a condição foi alcançada, o fluxo do programa será direcionado para a próxima instrução sequencial ou desvia para fora do loop. Uma estrutura de repetição é uma ideia fundamental de programação que é comumente usada na escrita de programas.

Deste modo, nesta aula estudaremos os principais conceitos relacionados a estrutura de repetição, bem como as diferentes estruturas e seus impactos no controle de fluxo de código.

## Objetivos da Aula

- Compreender o conceito de controle de fluxo de código.
- Reconhecer os tipos de estruturas de repetição.
- Compreender cada tipo de estrutura de controle de fluxo.
- Diferenciar as estruturas de repetição `for`, `while` e aninhada.

## Resumo

Considere o seguinte caso: você deseja somar os três primeiros números inteiros maiores que zero. Basta fazer `soma = 1 + 2 + 3`. Simples, certo? No entanto, e se você for solicitado a somar os mil primeiros números inteiros positivos? Programar isso manualmente levaria muito tempo.

Para resolver este problema, podemos construir um algoritmo que repita uma determinada instrução até que uma condição seja alcançada. Para tanto, temos duas estruturas de repetição principais: `while` e `for`.

### Estrutura `while`

A estrutura `while` executa um bloco de código enquanto uma condição for verdadeira:

```java
int contador = 1;
while (contador < 10) {
    System.out.println("Valor do contador é " + contador);
    contador++;
}
System.out.println("Fim");
```

Neste exemplo, enquanto `contador < 10`, o bloco interno será executado. Se `contador` já iniciasse com 10, o loop nunca seria executado.

### Estrutura `for`

O `for` é utilizado quando o número de iterações é conhecido previamente:

```java
System.out.println("Laço for");
for(int i = 0; i < 10; i++) {
    System.out.println("Valor : " + i);
}
```

A estrutura do `for` inclui:
- **Inicialização**: `int i = 0;`
- **Condição de parada**: `i < 10;`
- **Incremento**: `i++` (equivalente a `i = i + 1`)

Toda estrutura de repetição precisa de uma condição de parada para evitar loops infinitos.

### Diferença entre `for` e `while`

- **`for`**: Melhor para quando o número de iterações é conhecido.
- **`while`**: Melhor quando a condição de parada é baseada em eventos imprevisíveis.

### Estruturas Aninhadas

Uma estrutura de repetição pode conter outra dentro de si:

```java
for(int i = 0; i < 3; i++) {
    for(int j = 0; j <= 3; j++) {
        System.out.print(j);
    }
    System.out.println("\n");
}
```

Neste exemplo, para cada iteração de `i`, o loop interno de `j` é executado completamente.

As estruturas de repetição permitem um código mais eficiente, reduzindo a necessidade de repetição manual de comandos e otimizando o processamento de dados.