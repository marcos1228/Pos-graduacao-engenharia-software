# Polimorfismo

Polimorfismo é o núcleo da programação orientada a objetos. A maioria das linguagens modernas tem algum conceito de interfaces, funções virtuais e classes. Embora cada linguagem seja diferente em detalhes e possa ter conceitos específicos, a ideia central permanece a mesma. Você define uma classe base com funções virtuais; uma classe derivada pode substituir algumas, todas ou nenhuma dessas funções.

Embora a criação de referência polimórfica em Java seja fácil, o conceito por trás dela tem um impacto mais profundo na programação geral. Nesta aula veremos como o polimorfismo funciona e como podemos trabalhar com sobrecarga e sobrescrita de métodos na linguagem Java.

## Objetivos da aula

- Compreender o conceito de polimorfismo.
- Conhecer a implementação de sobrescrita de métodos.
- Compreender como ocorre a sobrecarga de métodos.
- Diferenciar a sobrecarga de sobrescrita.

## Resumo

O polimorfismo é um dos princípios fundamentais do Software Orientado a Objetos. O termo normalmente significa que algo que pode ter várias formas. Na metodologia orientada a objetos, o polimorfismo permite escrever programas que possuem referências de ligação tardias.

Uma referência polimórfica é uma variável que pode se referir a diferentes tipos de objetos em diferentes momentos. Normalmente é compatível com a classe a que se refere. Por exemplo, considere a declaração:

```java
Empregado emp;
```

O `emp` é uma variável de referência que pode se referir a uma instância da classe `Empregado`. A qualificação da variável de referência para um objeto referido é determinada por sua compatibilidade. Esta pode parecer a única condição confiável, mas isso não é exatamente verdade, especialmente ao implementar o polimorfismo.

A regra é muito rígida, mas o polimorfismo torna-se mais flexível ao incorporar a ideia de ter muitas formas. Isso significa que uma referência polimórfica garante que ela pode se referir a diferentes tipos de objetos em diferentes pontos no tempo, em vez de ficar presa à ideia de uma correspondência exata para compatibilidade.

Uma variável de referência refere-se a uma instância de uma classe. No caso de hierarquia de herança, um objeto de referência pode apontar para uma instância de qualquer classe na hierarquia, desde que a variável de referência seja declarada como o tipo de classe pai na árvore hierárquica.

## Sobrecarga de método (Overloading)

A Sobrecarga de Métodos é um recurso que permite que uma classe tenha vários métodos com o mesmo nome, mas com número, sequência ou tipo de parâmetros diferentes. Em resumo, vários métodos com o mesmo nome, mas com assinaturas diferentes. Por exemplo:

```java
public int somar(int a, int b) {
    return a + b;
}

public int somar(int a, int b, int c) {
    return a + b + c;
}
```

Para sobrecarregar um método, a lista de parâmetros dos métodos deve diferir em um destes aspectos:

- **Número de parâmetros**
  ```java
  public void metodo(int a);
  public void metodo(int a, int b);
  ```
- **Tipo de dados dos parâmetros**
  ```java
  public void metodo(int a);
  public void metodo(double a);
  ```
- **Sequência de tipos de dados dos parâmetros**
  ```java
  public void metodo(int a, double b);
  public void metodo(double a, int b);
  ```

## Sobrescrita de método (Overriding)

Declarar um método na subclasse que já está presente na classe pai é conhecido como sobrescrita de método. A sobrescrita é feita para que uma classe filha possa dar sua própria implementação a um método que já é fornecido pela classe pai. Por exemplo:

```java
class Pai {
    void comer() {
        System.out.println("Pai está comendo");
    }
}

class Filho extends Pai {
    @Override
    void comer() {
        System.out.println("Filho está comendo");
    }
}
```

Aqui, `Filho` sobrescreve o método `comer` de `Pai`, fornecendo uma nova implementação.

## Diferenças entre sobrecarga e sobrescrita

| Característica        | Sobrecarga (Overloading) | Sobrescrita (Overriding) |
|----------------------|------------------------|------------------------|
| Definição           | Múltiplos métodos com o mesmo nome, mas diferentes parâmetros. | Método da superclasse é redefinido na subclasse. |
| Assinatura do método | Deve ser diferente.    | Deve ser a mesma.    |
| Ocorrência          | Dentro da mesma classe. | Em classes diferentes (herança). |
| Palavra-chave `@Override` | Não usada. | Necessária para indicar sobrescrita. |

## Referências

- DEITEL, H., DEITEL, P. *Java: Como Programar*, 8ª edição. Pearson, 2010.
- FORBELLONE, A. L. V.; EBERSPACHER, H. F. *Lógica de programação: a construção de algoritmos e estruturas de dados*. São Paulo: Prentice Hall, 2005.
- MANZANO, J. A. N. G. *Algoritmos: lógica para desenvolvimento de programação de computadores*. 28ª ed. São Paulo: Érica, 2016.

