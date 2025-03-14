# 1. Tipos de Variáveis com Base no Escopo

## a) Variáveis de Instância
- Declaradas dentro de uma classe, mas fora de qualquer método.
- Pertencem a uma instância do objeto (cada objeto tem sua cópia).
- Não precisam ser inicializadas explicitamente, pois recebem valores padrão.

**Exemplo:**
```java
public class Pessoa {
    String nome; // Variável de instância
    int idade;   // Variável de instância
}
```

## b) Variáveis de Classe (Estáticas)
- Declaradas com `static`, pertencem à classe e não a uma instância.
- Compartilhadas por todos os objetos da classe.

**Exemplo:**
```java
public class Config {
    static String sistemaOperacional = "Windows"; // Variável de classe
}
```

## c) Variáveis Locais
- Declaradas dentro de métodos, blocos ou construtores.
- Devem ser inicializadas antes do uso.

**Exemplo:**
```java
public void mostrarMensagem() {
    String mensagem = "Olá, mundo!"; // Variável local
    System.out.println(mensagem);
}
```

## d) Variáveis de Parâmetro
- Definidas como argumentos de métodos ou construtores.
- Seu valor é passado quando o método é chamado.

**Exemplo:**
```java
public void setNome(String nome) { // 'nome' é um parâmetro
    this.nome = nome;
}
```

---

# 2. Tipos de Variáveis com Base no Tipo de Dado

## a) Tipos Primitivos
São os tipos de dados básicos do Java:

- `byte` (8 bits) → -128 a 127
- `short` (16 bits) → -32.768 a 32.767
- `int` (32 bits) → -2.147.483.648 a 2.147.483.647
- `long` (64 bits) → -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
- `float` (32 bits) → números de ponto flutuante de precisão simples
- `double` (64 bits) → números de ponto flutuante de precisão dupla
- `char` (16 bits) → um único caractere Unicode
- `boolean` (1 bit) → `true` ou `false`

**Exemplo:**
```java
int idade = 25;
double preco = 19.99;
boolean ativo = true;
char inicial = 'A';
```

## b) Tipos por Referência
- Apontam para objetos na memória.
- Incluem **Strings**, Arrays e Classes.

**Exemplo:**
```java
String nome = "Yuri";
int[] numeros = {1, 2, 3, 4};
Pessoa pessoa = new Pessoa();
```

---

# 3. Modificadores de Variáveis

- `final` → Torna a variável constante (imutável).
- `static` → Indica que a variável pertence à classe, e não à instância.
- `volatile` → Indica que a variável pode ser alterada por múltiplas threads.
- `transient` → Impede que a variável seja serializada.

**Exemplo:**
```java
public class Config {
    public static final double PI = 3.1415; // Constante
    private transient String senha; // Não será serializada
}
```

