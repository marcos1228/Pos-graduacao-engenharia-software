# Java Collections Framework

O Java Collections Framework é uma das partes principais da linguagem de programação Java. As coleções são usadas em quase todas as linguagens de programação. A maioria das linguagens de programação suporta vários tipos de coleções como List, Set, Queue, Stack, entre outras.

Java Collections então são as soluções completas para todos os trabalhos de manipulação de dados, como armazenamento de dados, pesquisa, classificação, inserção, exclusão e atualização de dados. Nesta aula você compreenderá como Java Collection trabalha e quais as classes e interfaces fornecidas pelo Framework.

## Objetivos da aula

- Compreender o conceito de Java Collection.
- Conhecer as principais classes do framework.
- Compreender como utilizar arrays dinâmicos para armazenar dados.
- Diferenciar os diferentes tipos de estruturas.

## Resumo

As coleções são como repositórios ou contêineres que agrupam vários itens em uma única unidade. Por exemplo, um pote de chocolates, uma lista de nomes, entre outros tipos de coleções.

Coleções são usadas em todas as linguagens de programação e quando o Java chegou, veio também com poucas classes de coleção – `Vector`, `Stack`, `Hashtable`, `Array`.

O Java 1.2 forneceu o Collections Framework que é a arquitetura para representar e manipular Collections em Java de maneira padrão. Este framework consiste em interfaces, classes de implementação e algoritmos.

As interfaces do Java Collections Framework fornecem o tipo de dados abstrato para representar a coleção.

A interface raiz do Collections Framework é `java.util.Collection`. Ela está no topo da hierarquia da estrutura Collections e contém alguns métodos importantes como `size()`, `iterator()`, `add()`, `remove()`, `clear()` que toda classe Collection deve implementar.

Algumas outras interfaces importantes são `java.util.List`, `java.util.Set`, `java.util.Queue` e `java.util.Map`. O `Map` é a única interface que não herda da interface Collection, mas faz parte do framework Collections. Todas as interfaces do framework de coleções estão presentes no pacote `java.util`.

A estrutura Java Collections fornece classes de implementação para interfaces de coleção principal. Algumas das mais importantes são `ArrayList`, `LinkedList`, `HashMap`, `TreeMap`, `HashSet` e `TreeSet`.

### Classes e Interfaces Importantes

#### Interface List

`List` é uma coleção ordenada e pode conter elementos duplicados. Você pode acessar qualquer elemento pelo seu índice. `List` é mais como um array com tamanho dinâmico e é um dos tipos de coleção mais usados. `LinkedList` e `ArrayList` são classes de implementação da interface `List`.

#### Exemplo de uso de List
```java
List<String> minhaLista = new ArrayList<>();
minhaLista.add(0, "0");
minhaLista.add(1, "1");
minhaLista.set(1, "2");
minhaLista.remove("1");
```

#### Interface Queue

`Queue` é uma coleção responsável por armazenar elementos e processá-los na ordem FIFO (First-In-First-Out). Algumas classes de implementação incluem `PriorityQueue` e `LinkedList`.

#### Interface Map

`Map` é um objeto responsável por mapear chaves para valores. As operações básicas incluem `put`, `get`, `containsKey`, `containsValue`, `size` e `isEmpty`.

As implementações mais comuns de `Map` são:
- `HashMap`
- `TreeMap`
- `LinkedHashMap`

#### Classe HashSet

`HashSet` é a implementação básica da interface `Set`, baseada em `HashMap`. Ele não garante a ordem de iteração e permite elementos nulos.

#### Classe TreeSet

`TreeSet` ordena os elementos usando sua ordenação natural ou um `Comparator` fornecido. Tem um desempenho de tempo `O(log n)` para operações básicas.

#### Classe ArrayList

`ArrayList` implementa a interface `List` e é baseada em uma estrutura de dados `Array`. Diferente de arrays tradicionais, `ArrayList` pode crescer e diminuir dinamicamente.

#### Classe PriorityQueue

`PriorityQueue` processa seus elementos com base em prioridade definida por um `Comparator`. Não permite valores nulos e não possui limite de tamanho.

## Tópicos Avançados

Frameworks Java podem ser definidos como esqueletos de código reutilizável. O uso de frameworks reduz a necessidade de codificação manual e permite que os desenvolvedores foquem na lógica de negócios.

## Referências Bibliográficas

- DEITEL, H., DEITEL, P. *Java: Como Programar*, 8ª edição. Pearson, 2010.
- FORBELLONE, A. L. V.; EBERSPACH, F. *Lógica de Programação: A Construção de Algoritmos e Estruturas de Dados*. Pearson, 2005.