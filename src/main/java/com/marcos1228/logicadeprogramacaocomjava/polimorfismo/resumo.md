# **Fundamentos da Programação Orientada a Objetos (POO)**

## **1. Conceitos Básicos de POO**
A **Programação Orientada a Objetos (POO)** gira em torno dos conceitos de **objetos** e **classes**. Em Java, as classes são modelos para os objetos, enquanto os objetos são instâncias de uma classe.

## **2. Encapsulamento**
O **encapsulamento** é um dos princípios fundamentais da POO e permite ocultar os detalhes internos de um método ou classe, expondo apenas o necessário. Isso melhora a segurança e organização do código.

## **3. Herança**
A **herança** é um mecanismo que permite que uma classe derive características (atributos e métodos) de outra classe, promovendo a reutilização de código e criando uma hierarquia.

**Vantagens da Herança:**
- Reutilização de código
- Facilita a manutenção
- Permite a criação de hierarquias

### **Exemplo em Java:**
```java
class Animal {
    String nome;
    void fazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido: Au Au!");
    }
}
```

## **4. Relação entre Herança e Composição**
A relação entre uma classe específica e uma classe genérica pode ser explicada por dois conceitos:

- **Herança (É UM):** Um cachorro **é um** animal.
- **Composição (TEM UM):** Um carro **tem um** motor.

Essas relações ajudam a definir como os objetos interagem entre si.

## **5. Diferença entre "É um" e "Tem um"**
| Relação        | Tipo         |
|---------------|-------------|
| **É um**     | Herança     |
| **Tem um**   | Composição  |

## **6. Polimorfismo**
O **polimorfismo** permite que um mesmo método tenha diferentes implementações dependendo da classe onde é chamado. Existem dois tipos principais:

### **6.1 Polimorfismo de Sobrecarga (Compile-time)**
- Ocorre quando uma classe possui vários métodos com o mesmo nome, mas com diferentes parâmetros.

```java
class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }
    int somar(int a, int b, int c) {
        return a + b + c;
    }
}
```

### **6.2 Polimorfismo de Substituição (Runtime)**
- Ocorre quando uma subclasse redefine um método da superclasse.

```java
class Animal {
    void fazerSom() {
        System.out.println("Som genérico");
    }
}
class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau!");
    }
}
```

## **7. Diferença entre Herança e Polimorfismo**

| **Herança** | **Polimorfismo** |
|------------|----------------|
| Permite que uma classe herde atributos e métodos de outra | Permite que um método tenha diferentes comportamentos em classes derivadas |
| Usa `extends` | Usa `@Override` para redefinir métodos |
| Foca na reutilização de código | Foca na flexibilidade e extensibilidade do código |

## **8. Conclusão**
Os fundamentos da **Programação Orientada a Objetos** são essenciais para a criação de sistemas organizados, reutilizáveis e flexíveis. Com **herança, encapsulamento, polimorfismo e composição**, os desenvolvedores podem construir soluções mais eficientes e escaláveis.

