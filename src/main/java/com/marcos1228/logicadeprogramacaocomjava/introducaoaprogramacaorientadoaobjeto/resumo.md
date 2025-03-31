# Introdução à Programação Orientada a Objetos

## Introdução

A programação orientada a objetos (POO) é um paradigma essencial na programação Java, utilizado para projetar sistemas com classes e objetos. Essa abordagem permite estruturar programas de forma modular, controlando o acesso aos dados. POO define tipos de dados e as operações que podem ser aplicadas a eles.

Nesta aula, aprenderemos os conceitos básicos de POO em Java, explorando princípios como herança, abstração e polimorfismo. Esses conceitos ajudam a modelar entidades do mundo real em programas e permitem reutilização de código sem comprometer a segurança. Algumas das linguagens orientadas a objetos mais populares incluem Java, C++, C#, JavaScript, Python, Ruby e Perl.

## Objetivos da Aula

- Compreender o conceito de programação orientada a objetos.
- Reconhecer os princípios fundamentais da POO.
- Aplicar cada princípio no desenvolvimento de sistemas.
- Diferenciar programação estruturada de programação orientada a objetos.

## Resumo

A POO é um paradigma de programação baseado no conceito de objetos, que contêm dados (atributos) e comportamentos (métodos). Diferente dos sistemas baseados em lógica e processos, a POO permite a organização de código em classes reutilizáveis.

Linguagens como Java implementam a POO para estruturar softwares de maneira eficiente, facilitando a manutenção e expansão do código. A abordagem permite manipular e organizar dados como objetos, vinculando-os a funções específicas.

## Estrutura da POO

### 1. Classes

Uma **classe** é um modelo para a criação de objetos. Ela define atributos (dados) e métodos (comportamentos). Pode ser comparada a uma planta arquitetônica, que serve de guia para a construção de um objeto.

#### Estrutura de uma classe em Java:
```java
public class Exemplo {
    private int numero;
    
    public Exemplo(int numero) {
        this.numero = numero;
    }
    
    public void exibirNumero() {
        System.out.println("Número: " + numero);
    }
}
```

### 2. Objetos

Um **objeto** é uma instância de uma classe. Ele possui atributos próprios e pode executar métodos definidos na classe.

Exemplo de criação de um objeto:
```java
Exemplo exemplo = new Exemplo(10);
exemplo.exibirNumero();
```

### 3. Construtores e Métodos

Um **construtor** é um método especial chamado na criação de um objeto, geralmente utilizado para inicializar atributos.

Os **métodos** definem as ações que um objeto pode realizar.

### 4. Atributos

Os **atributos** armazenam dados dos objetos. Eles são definidos dentro da classe e podem ser manipulados pelos métodos.

### 5. Encapsulamento

O **encapsulamento** protege os dados internos de um objeto, permitindo acesso apenas por meio de métodos específicos. Isso garante segurança e integridade dos dados.

```java
public class ContaBancaria {
    private double saldo;
    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
```

### 6. Modificadores de Acesso

Os modificadores controlam a visibilidade de atributos e métodos:

- **private**: Acessível apenas dentro da mesma classe.
- **default**: Acessível dentro do mesmo pacote.
- **protected**: Acessível no mesmo pacote e por subclasses.
- **public**: Acessível de qualquer parte do programa.

### Conclusão

A programação orientada a objetos facilita a organização e reutilização de código. Com conceitos como classes, objetos, encapsulamento e modificadores de acesso, a POO torna os sistemas mais modulares e fáceis de manter.

