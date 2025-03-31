# Modularização e Estruturas de Repetição em Java

Em Java, a **modularização de código** é fundamental para organizar e reutilizar blocos de instruções. Os **métodos** desempenham esse papel, permitindo encapsular tarefas específicas dentro de um programa. Um método pode receber valores, processá-los e retornar um resultado, como um **GPS** que recebe um destino e calcula a rota.

A declaração de um método inclui:

- **Modificador de acesso** (público ou privado)
- **Tipo de retorno** (ou `void` se não houver retorno)
- **Nome do método**
- **Parâmetros de entrada**

## Estruturas de Repetição

As estruturas de repetição são essenciais para automatizar tarefas repetitivas.

### Laço `for`

O **laço `for`** é ideal para repetir um bloco de código **um número fixo de vezes**.  
Imagine um **relógio** que precisa contar de 1 a 12; o laço `for` permite executar um bloco de código para cada número nesse intervalo.

#### Sintaxe do `for`
```java
for (int i = 1; i <= 12; i++) {
    System.out.println(i);
}
