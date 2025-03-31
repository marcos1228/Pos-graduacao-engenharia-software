# Operadores Lógicos em Java

Os operadores lógicos em Java são usados para combinar ou inverter valores booleanos (`true` ou `false`), sendo fundamentais em expressões condicionais.

## Principais Operadores

| Operador | Nome               | Descrição | Exemplo |
|----------|--------------------|-----------|---------|
| `&&`     | AND (E)           | Retorna `true` se **ambas** as condições forem verdadeiras. | `(x > 5 && y < 10)` |
| `||`     | OR (OU)           | Retorna `true` se **pelo menos uma** das condições for verdadeira. | `(x > 5 || y < 10)` |
| `!`      | NOT (NÃO)         | Inverte o valor booleano. | `!(x > 5)` |
| `^`      | XOR (OU exclusivo) | Retorna `true` se **exatamente uma** das condições for verdadeira. | `(x > 5 ^ y < 10)` |

## Exemplos de Uso

### AND (`&&`)
```java
int idade = 20;
boolean temCarteira = true;
if (idade >= 18 && temCarteira) {
    System.out.println("Pode dirigir.");
}
```

### OR (`||`)
```java
boolean temDinheiro = false;
boolean temCartao = true;
if (temDinheiro || temCartao) {
    System.out.println("Compra autorizada.");
}
```

### NOT (`!`)
```java
boolean chovendo = false;
if (!chovendo) {
    System.out.println("Pode sair sem guarda-chuva.");
}
```

### XOR (`^`)
```java
boolean a = true;
boolean b = false;
System.out.println(a ^ b); // true
```

## Avaliação Curta (Short-Circuit)
Os operadores `&&` e `||` utilizam avaliação curta, evitando execução desnecessária de código:

```java
int x = 10;
if (x > 5 && metodo()) {
    System.out.println("Executado");
}

public static boolean metodo() {
    System.out.println("Método chamado");
    return true;
}
```
Se `x > 5` for `false`, `metodo()` **não será chamado**.

## Conclusão
Os operadores lógicos são essenciais para a lógica de programas Java. Utilize-os para estruturar suas condições e otimizar a execução do código!

---
*Autor: [Seu Nome]*

