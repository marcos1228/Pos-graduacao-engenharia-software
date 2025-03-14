# Métodos da Classe String em Java

A classe `String` em Java fornece diversos métodos para manipulação de texto. Abaixo está uma lista organizada dos principais métodos.

## 1. Criação de Strings
```java
String str1 = "Hello, World!"; // Usando literal
String str2 = new String("Hello, Java!"); // Usando o construtor
```

## 2. Comparando Strings
- **`equals(String anotherString)`**: Compara duas strings considerando maiúsculas e minúsculas.
- **`equalsIgnoreCase(String anotherString)`**: Compara duas strings ignorando maiúsculas e minúsculas.
- **`compareTo(String anotherString)`**: Compara lexicograficamente duas strings.
- **`compareToIgnoreCase(String anotherString)`**: Compara lexicograficamente ignorando maiúsculas/minúsculas.

```java
String s1 = "java";
String s2 = "Java";
System.out.println(s1.equals(s2)); // false
System.out.println(s1.equalsIgnoreCase(s2)); // true
```

## 3. Manipulação de Strings
- **`toUpperCase()`**: Converte para maiúsculas.
- **`toLowerCase()`**: Converte para minúsculas.
- **`trim()`**: Remove espaços no início e fim.
- **`replace(char oldChar, char newChar)`**: Substitui caracteres.
- **`replaceAll(String regex, String replacement)`**: Substitui todas as ocorrências com regex.
- **`substring(int beginIndex, int endIndex)`**: Extrai parte da string.

```java
String s = " Java ";
System.out.println(s.trim()); // "Java"
System.out.println(s.toUpperCase()); // " JAVA "
System.out.println(s.replace('J', 'C')); // " Cava "
```

## 4. Busca em Strings
- **`indexOf(char ch)`**: Retorna o índice da primeira ocorrência.
- **`lastIndexOf(char ch)`**: Retorna o índice da última ocorrência.
- **`contains(CharSequence s)`**: Verifica se a string contém uma sequência de caracteres.
- **`startsWith(String prefix)`**: Verifica se a string começa com determinado prefixo.
- **`endsWith(String suffix)`**: Verifica se a string termina com determinado sufixo.

```java
String str = "Hello, World!";
System.out.println(str.indexOf('o')); // 4
System.out.println(str.contains("World")); // true
System.out.println(str.startsWith("Hello")); // true
System.out.println(str.endsWith("!")); // true
```

## 5. Quebra de String
- **`split(String regex)`**: Divide a string em um array baseado em um delimitador.

```java
String csv = "apple,orange,banana";
String[] fruits = csv.split(",");
System.out.println(Arrays.toString(fruits)); // [apple, orange, banana]
```

## 6. Conversão de Tipos
- **`toCharArray()`**: Converte para um array de caracteres.
- **`valueOf(primitiveType)`**: Converte valores primitivos para `String`.

```java
char[] chars = "Java".toCharArray();
System.out.println(Arrays.toString(chars)); // [J, a, v, a]
System.out.println(String.valueOf(100)); // "100"
```

## 7. Concatenação e Formatação
- **`concat(String str)`**: Concatena duas strings.
- **`format(String format, Object... args)`**: Formata a string com placeholders.

```java
String name = "Java";
System.out.println("Hello, ".concat(name)); // "Hello, Java"
System.out.println(String.format("%s is %d years old", "Alice", 25));
```

## Conclusão
A classe `String` em Java é poderosa e oferece diversos métodos para manipulação de texto. Esta referência cobre os principais métodos utilizados no dia a dia da programação.

