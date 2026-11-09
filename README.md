# Java Challenges

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20andamento-blue)

Coleção de exercícios e desafios resolvidos durante meus estudos de fundamentos de Java. Os exercícios estão organizados por aula, em ordem crescente de dificuldade: da saída no console até um pequeno sistema bancário interativo.

## Sumário

- [Conceitos praticados](#conceitos-praticados)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Exercícios](#exercícios)
- [Como executar](#como-executar)
- [Projeto relacionado](#projeto-relacionado)
- [Autor](#autor)

## Conceitos praticados

- Estrutura de uma classe e método `main`
- Variáveis e tipos primitivos (`int`, `double`, `char`, `boolean`)
- Operadores aritméticos, relacionais e lógicos
- Casting e concatenação de `String`
- Formatação de saída com `printf` e text blocks
- Entrada de dados com `Scanner`
- Condicionais (`if` / `else if` / `else`)
- Laços de repetição (`for` e `while`)
- Menus interativos no terminal

## Estrutura do projeto

```text
java-challenges/
└── src/
    └── challenges/
        ├── class1/   # Primeiros passos e saída no console
        ├── class2/   # Variáveis, casting e concatenação
        ├── class3/   # Condicionais, laços e Scanner
        └── class4/   # Projeto final: conta bancária
```

Cada exercício é uma classe independente, com seu próprio método `main`.

## Exercícios

### Aula 1: Primeiros passos

| Exercício | Descrição |
|-----------|-----------|
| [`Profile`](src/challenges/class1/Profile.java) | Exibe uma saudação personalizada usando uma variável `String`. |
| [`Study`](src/challenges/class1/Study.java) | Explica no console o que são a JVM e o JDK. |
| [`Sum`](src/challenges/class1/Sum.java) | Soma dois números inteiros e exibe a operação. |
| [`Subtraction`](src/challenges/class1/Subtraction.java) | Subtrai dois números inteiros e exibe a operação. |

### Aula 2: Variáveis, casting e concatenação

| Exercício | Descrição |
|-----------|-----------|
| [`CastingConcatenating`](src/challenges/class2/CastingConcatenating.java) | Calcula uma média convertendo `double` para `int` e concatena `char` com `String`. |
| [`FahrenheitConversor`](src/challenges/class2/FahrenheitConversor.java) | Converte Celsius para Fahrenheit e formata a saída com text block. |
| [`Products`](src/challenges/class2/Products.java) | Calcula preço total, conversão de moeda e preço com desconto. |

### Aula 3: Condicionais, laços e entrada de dados

| Exercício | Descrição |
|-----------|-----------|
| [`VerifyNumber`](src/challenges/class3/VerifyNumber.java) | Lê um número, valida a entrada e informa se é par ou ímpar. |
| [`EqualNumbers`](src/challenges/class3/EqualNumbers.java) | Lê dois números e informa se são iguais ou diferentes. |
| [`AreaCalculator`](src/challenges/class3/AreaCalculator.java) | Menu que calcula a área de uma figura geométrica escolhida pelo usuário. |
| [`MultiplicationTable`](src/challenges/class3/MultiplicationTable.java) | Exibe a tabuada de 1 a 10 do número informado. |
| [`Factorial`](src/challenges/class3/Factorial.java) | Calcula o fatorial de um número usando laço `for`. |

### Aula 4: Projeto final

| Exercício | Descrição |
|-----------|-----------|
| [`BankAccount`](src/challenges/class4/BankAccount.java) | Sistema bancário em menu: consultar saldo, receber valores e transferir com validação de saldo. |

## Como executar

**Pré-requisito:** JDK 17 ou superior (alguns exercícios usam text blocks).

### Pelo terminal

```bash
# Clonar o repositório
git clone https://github.com/ViitoDev/java-challenges.git
cd java-challenges

# Compilar todos os exercícios
javac -d out src/challenges/*/*.java

# Executar um exercício (pacote + nome da classe)
java -cp out challenges.class4.BankAccount
```

Para rodar outro exercício, troque `challenges.class4.BankAccount` pelo pacote e pela classe desejados, por exemplo `challenges.class3.Factorial`.

### Pela IDE

Abra a pasta do projeto no IntelliJ IDEA (ou em outra IDE Java), marque `src` como *Sources Root* e execute o método `main` da classe desejada.

## Projeto relacionado

**[ByteFlix](https://github.com/ViitoDev/byteflix)**: projeto prático do mesmo curso, que simula funcionalidades de uma plataforma de streaming de filmes.

## Autor

**João Barros**: [@ViitoDev](https://github.com/ViitoDev)
