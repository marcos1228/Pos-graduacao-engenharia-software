# Métodos do System.out e System.err no Java

Os métodos da classe `System` são usados para imprimir mensagens no console. Eles fazem parte da API do Java e são amplamente utilizados para depuração e saída de dados.

## 1. `System.out.print()`

**Descrição:** Imprime um texto no console **sem** pular para a próxima linha.

**Saída:** O cursor do terminal continua na mesma linha após a impressão.

**Exemplo:**

```java
System.out.print("Olá, ");
System.out.print("mundo!");
```

**Saída no console:**

```
Olá, mundo!
```

---

## 2. `System.out.println()`

**Descrição:** Imprime um texto no console e pula para a próxima linha.

**Saída:** O cursor do terminal vai para a linha seguinte após a impressão.

**Exemplo:**

```java
System.out.println("Olá, mundo!");
System.out.println("Bem-vindo ao Java!");
```

**Saída no console:**

```
Olá, mundo!
Bem-vindo ao Java!
```

---

## 3. `System.out.printf()`

**Descrição:** Permite imprimir valores formatados, similar ao `printf` de C.

**Útil para:** Exibir números com casas decimais controladas, alinhar textos, formatar datas, etc.

**Exemplo:**

```java
double preco = 12.34567;
System.out.printf("O preço é R$ %.2f%n", preco);
```

**Saída no console:**

```
O preço é R$ 12.35
```

**Principais especificadores:**

- `%f` → Número decimal (ponto flutuante)
- `%.2f` → Define 2 casas decimais
- `%n` → Quebra de linha (melhor do que `\n` para compatibilidade entre sistemas operacionais)

---

## 4. `System.err.println()`

**Descrição:** Imprime mensagens de erro no console (saída de erro padrão).

**Útil para:** Destacar mensagens de erro separadas da saída normal.

**Exemplo:**

```java
System.err.println("Erro: Falha na conexão!");
```

Essa saída pode aparecer destacada em vermelho em alguns terminais.

---

## 5. Diferença entre `System.out` e `System.err`

| Método                | Uso                      |
|----------------------|------------------------|
| `System.out.println()` | Saída normal (`stdout`) |
| `System.err.println()` | Saída de erro (`stderr`) |

Nos sistemas Unix/Linux, você pode redirecionar `stdout` e `stderr` separadamente:

```sh
java MeuPrograma > saida.txt      # Redireciona stdout para um arquivo
java MeuPrograma 2> erro.txt      # Redireciona stderr para um arquivo
java MeuPrograma > saida.txt 2> erro.txt  # Redireciona ambos separadamente
```

Esses métodos são essenciais para a depuração e exibição de informações em aplicações Java.

