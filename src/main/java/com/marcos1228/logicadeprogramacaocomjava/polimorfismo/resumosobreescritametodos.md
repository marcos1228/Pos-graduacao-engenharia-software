# Sobrescrita de Métodos (Method Overriding) em Java

A sobrescrita de métodos é um conceito fundamental na Programação Orientada a Objetos (POO), que permite que uma subclasse forneça uma implementação específica de um método já definido na sua superclasse. Diferente da sobrecarga de métodos, onde o método tem o mesmo nome, mas com diferentes parâmetros, a sobrescrita de métodos permite que o método da subclasse altere o comportamento de um método da superclasse.

## Características da Sobrescrita de Métodos:

- **Mesma Assinatura**: O método da subclasse deve ter a mesma assinatura (nome, tipo de retorno e parâmetros) que o método da superclasse.

- **Reescrita de Comportamento**: A sobrescrita permite que a subclasse altere o comportamento do método da superclasse.

- **Anotação `@Override`**: Embora não seja obrigatória, a anotação `@Override` é usada para garantir que estamos sobrescrevendo corretamente o método da superclasse. Caso o método não exista na superclasse, o compilador irá gerar um erro.

- **Polimorfismo**: A sobrescrita de métodos é uma característica chave do polimorfismo, permitindo que objetos de tipos diferentes respondam a chamadas de método de maneira específica, conforme sua classe.

## Exemplo de Sobrescrita de Métodos:

```java
class Animal {
    // Método da superclasse
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    // Sobrescreve o método da superclasse
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

class Gato extends Animal {
    // Sobrescreve o método da superclasse
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        // Polimorfismo: a chamada do método é determinada pelo tipo real do objeto
        meuCachorro.fazerSom(); // Saída: O cachorro late
        meuGato.fazerSom();     // Saída: O gato mia
    }
}
```

### Explicação do Exemplo:
- A classe `Animal` tem um método `fazerSom()` que é sobrescrito nas classes `Cachorro` e `Gato`.
- Embora os três objetos sejam do tipo `Animal`, quando o método `fazerSom()` é chamado, o comportamento específico é determinado pelo tipo real do objeto (`Cachorro` ou `Gato`), ilustrando o polimorfismo.

## Regras para Sobrescrita de Métodos:

1. **Assinatura Idêntica**: O método na subclasse deve ter a mesma assinatura (nome, tipo de retorno e parâmetros) que o método da superclasse.

2. **Tipo de Retorno**: O tipo de retorno do método sobrescrito deve ser compatível com o tipo de retorno do método da superclasse (ou um subtipo). Isso é chamado de "covariant return type".

3. **Acesso**: O modificador de acesso do método sobrescrito não pode ser mais restritivo que o da superclasse. Ou seja, se o método da superclasse é `public`, o método sobrescrito também deve ser `public` (não pode ser `protected` ou `private`).

4. **Exceções**: O método sobrescrito não pode lançar exceções mais genéricas do que as que são lançadas pelo método da superclasse. Ele pode lançar exceções mais específicas ou nenhuma exceção.

## Exemplo com Exceções:

```java
class Animal {
    public void comer() throws Exception {
        System.out.println("Animal está comendo");
    }
}

class Cachorro extends Animal {
    // Sobrescrevendo o método comer sem lançar exceções
    @Override
    public void comer() {
        System.out.println("Cachorro está comendo");
    }
}
```

## Vantagens da Sobrescrita de Métodos:

- **Polimorfismo**: A sobrescrita é uma característica chave do polimorfismo. Ela permite que um único método tenha diferentes comportamentos, dependendo da classe do objeto que o chama.

- **Reusabilidade e Extensão**: Ao sobrescrever métodos, você pode estender o comportamento de uma classe sem modificar o código original da superclasse.

- **Facilidade de Manutenção**: A sobrescrita de métodos facilita a manutenção do código, pois você pode alterar o comportamento de classes especializadas sem precisar alterar a superclasse.

## Resumo:
A sobrescrita de métodos em Java permite que uma subclasse forneça uma implementação específica para um método que já foi definido na superclasse. Ela é essencial para a implementação de polimorfismo, onde o comportamento de um método pode variar dependendo do tipo do objeto. Esse conceito promove a reutilização de código e torna o código mais flexível e fácil de manter.

