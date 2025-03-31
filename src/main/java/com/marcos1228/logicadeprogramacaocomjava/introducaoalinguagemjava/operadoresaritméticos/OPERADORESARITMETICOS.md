# Operadores Aritméticos em Java

Os operadores aritméticos em Java são utilizados para realizar operações matemáticas como adição, subtração, multiplicação, divisão e módulo. Eles podem ser aplicados a tipos numéricos como `int`, `double`, `float`, entre outros.

## Tabela de Operadores

| Operador | Descrição  | Exemplo | Resultado |
|----------|-------------|---------|-----------|
| `+` | Adição | `5 + 3` | `8` |
| `-` | Subtração | `10 - 4` | `6` |
| `*` | Multiplicação | `7 * 2` | `14` |
| `/` | Divisão | `9 / 2` | `4` (inteiro) ou `4.5` (ponto flutuante) |
| `%` | Módulo (resto da divisão) | `10 % 3` | `1` |

## Exemplos em Java

```java
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }
}
```

## Observações Importantes
- A divisão entre dois inteiros retorna um inteiro, descartando a parte decimal. Para obter um resultado com casas decimais, utilize `double` ou `float`.
- O operador `%` é útil para verificar divisibilidade e ciclos repetitivos.

Esses operadores são fundamentais para manipulação de dados numéricos em Java!

